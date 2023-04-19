package com.virtusa.tms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.virtusa.tms.Exception.UserException;
import com.virtusa.tms.dao.UserDao;
import com.virtusa.tms.dto.Transaction;
import com.virtusa.tms.dto.User;
import com.virtusa.tms.dto.Vehicle;

  @Service
  public class UserService {

	@Autowired
	UserDao udao;
	
	@Autowired
	Environment env;
	
	public User  addUser(User u) {
		
       return udao.save(u);
	}
	
	
	public User modUser(User u) {
		
			 return udao.save(u);
		}
		
	public List<User> getallUsers(){
	List<User> ul=	udao.findAll();
	return ul;
	}
	
	public void DeleteUser(int id) throws Exception{
		if(udao.existsById(id)) {
	  Optional<User> o=	udao.findById(id);
        User u1=o.get();
	    udao.deleteById(id);
	    
	    
		}
		else {
	throw new UserException("Please enter valid ID");
  }
	}
	
	
 public  User ValidateUser(String a,String b){
 User  u=udao.validateUser(a, b);
return u;
			}
 
 public List<Transaction> getTransactionsByUserId(int id){
	 List<Transaction> l=udao.findById(id).get().getTrans();
	 return l;
   
    
    
	 
 }
 
 

 
			
		
		}
		
		
	


