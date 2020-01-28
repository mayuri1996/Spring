package com.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Contact;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api")
public class MyController {
	
	private List<Contact> list = createList();
	
  @RequestMapping(value="/welcome",method=RequestMethod.GET)	
   public String myMsg(){
	   return "Welcome to SpringBoot App";
   }
  
  //Gel All List
  @GetMapping(produces="application/json")
  public List<Contact> getList(){
	  return list;
  }
  
  //Delete Entry
  @DeleteMapping(path={"/{id}"})
  public Contact delete(@PathVariable("id") int id){
	  Contact listId = null;
	  for(Contact obj:list){
		  if(obj.getId().equals(id)){
			  System.out.println("data "+obj);
			  list.remove(obj);
			  listId = obj;
			  break;
		  }
	  }
	  return listId;
  }
  
  //Add new entry
  @PostMapping
  public Contact createEntry(@RequestBody Contact user){
	  list.add(user);
	  return user;
  }
  
  //update
//  @PutMapping("/update/{id}")
//  public Contact update(@PathVariable("id") int id,@RequestBody Contact user){
//	  for(Contact obj:list){
//		  if(obj.getId().equals(id)){
//			  list.add(user);
//			  break;
//		  }
//	  }
//	  System.out.println("data "+list);
//	  return user;
//  }
//  
  public List<Contact> createList(){
	  List<Contact> tempList = new ArrayList<>();
	  Contact obj1 = new Contact();
	  obj1.setId("1");
	  obj1.setName("Mayuri");
	  obj1.setEmail("mayuri@gmail.com");
	  obj1.setPhonenumb("6758946578");
	  
	  Contact obj2 = new Contact();
	  obj2.setId("2");
	  obj2.setName("Sunidhi");
	  obj2.setEmail("sunidhi@gmail.com");
	  obj2.setPhonenumb("6758946578");		  
	  
	  tempList.add(obj1);
	  tempList.add(obj2);
	  return tempList;
  }
}
