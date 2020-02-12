package jf.repository.signin;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import jf.model.signin.SignInModel;

public interface SignInRepository extends JpaRepository<SignInModel, Long> {
	
	SignInModel findByEmailid(String email);
}
