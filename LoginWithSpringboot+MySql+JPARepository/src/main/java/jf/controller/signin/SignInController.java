package jf.controller.signin;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jf.message.request.Loginform;
import jf.message.response.ResponseMessage;
import jf.model.signin.SignInModel;
import jf.repository.signin.SignInRepository;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SignInController {
	
	@Autowired
    private SignInRepository signinRepository;
	
	@PostMapping("/login")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody Loginform loginRequest){
			SignInModel user = signinRepository.findByEmailid(loginRequest.getUsername());
			
			if(user == null){		
				return new ResponseEntity<>(new ResponseMessage("fail->user dosenot exist"), HttpStatus.BAD_REQUEST);
			}
			else if(!user.getPassword().equals(loginRequest.getPassword())){
				return new ResponseEntity<>(new ResponseMessage("fail->password doesnot match"), HttpStatus.BAD_REQUEST);
			}
			else {
				return new ResponseEntity<>(new ResponseMessage("login Successfull"), HttpStatus.BAD_REQUEST);
			}
			
	}

}
