package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.demo.model.Contact;

@SpringBootApplication

//@PropertySource("classpath:email.properties")
//@PropertySources({
//	@PropertySource("classpath:email.properties")
//})
public class MyApp {
  public static void main(String[] args){
	  ConfigurableApplicationContext ctx=SpringApplication.run(MyApp.class,args);
	  Contact cnt = (Contact)ctx.getBean(Contact.class);
	  System.out.println("EmailId "+cnt.getEmail());
	  System.out.println("Contcat Numb "+cnt.getPhonenumb());
  }
  
  
  @Value("${contact.emailId}")
  public String email;
  
  @Value("${contact.phone}")
  public String phonenumb;
  
  @Bean
  public Contact getDetails(){
	  Contact cnt = new Contact();
	  cnt.setEmail(email);
	  cnt.setPhonenumb(phonenumb);
	  return cnt;
  }
}

