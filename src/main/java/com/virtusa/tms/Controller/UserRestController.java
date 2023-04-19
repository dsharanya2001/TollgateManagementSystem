package com.virtusa.tms.Controller;



import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.tms.Exception.UserException;
import com.virtusa.tms.dao.StaffDao;
import com.virtusa.tms.dao.TransactionDao;
import com.virtusa.tms.dao.UserDao;
import com.virtusa.tms.dto.Staff;
import com.virtusa.tms.dto.Transaction;
import com.virtusa.tms.dto.User;
import com.virtusa.tms.dto.Vehicle;
import com.virtusa.tms.service.StaffService;
import com.virtusa.tms.service.UserService;


@RestController
@RequestMapping("/tmsuser")
public class UserRestController {
	
	@Autowired
	UserService us;
	@Autowired
	UserDao udao;
	@Autowired
	Environment env;
	
	Log log=LogFactory.getLog(this.getClass());
	
	@PostMapping("User/adduser")
	public  User AddUser(@RequestBody User u) {
		User u1=us.addUser(u);
		log.info(env.getProperty("ua"));
		
    return u1;
	}
	
	@PutMapping("User/moduser")
	public  User UpdateUser(@PathVariable User u)  {
    User u1=us.modUser(u);
    log.info(env.getProperty("mod"));
    return u1;
	}
	
	@GetMapping("/Admin/getallusers")
	public List<User> getallUsers() {
		log.info(env.getProperty("uf"));
		return us.getallUsers();
		
	}
	
	@GetMapping("User/validateuser/{email}/{pass}")
	public User ValidateUser(@PathVariable("email") String uemail,@PathVariable("pass") String upass) throws Exception{
		User u=us.ValidateUser(uemail, upass);
		if(u!=null) {
			log.info(env.getProperty("val"));
		return u;
		}
		else {
		throw new UserException("User not found");
		}
		//return new ResponseEntity<String>(env.getProperty("error"),HttpStatus.NOT_FOUND);
		
	
	}
	@GetMapping("Admin/gettransbyid/{uid}")
	public List<Transaction> getTransactionsByUserId(@PathVariable("uid")int id) throws Exception{
		if(udao.existsById(id)) {
		List<Transaction>ul=us.getTransactionsByUserId(id);
		log.info(env.getProperty("sucess"));
		return ul;
		}
		else {
			log.info(env.getProperty("error"));
			throw new UserException(env.getProperty("error"));
		}
		
	}
		
	@DeleteMapping("Admin/deleteuser/{uid}")
	public String deleteUser(@PathVariable("uid") int id) throws Exception {
		if(udao.existsById(id)) {
		log.info(env.getProperty("ud"));
		  us.DeleteUser(id);
		  return "User deleted sucessfully";
	}
		else {
			log.info(env.getProperty("error"));
			throw new UserException(env.getProperty("error"));
		}
	}
	
	
	
	
	
	
	
	
}
