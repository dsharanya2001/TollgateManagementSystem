package com.virtusa.tms.Controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.tms.Exception.UserException;
import com.virtusa.tms.dao.FareDao;
import com.virtusa.tms.dto.Fare;

import com.virtusa.tms.service.FareService;


@RestController
@RequestMapping("/tmsfare")
public class FareController {

	@Autowired
	FareService fs;
	@Autowired
	FareDao fdao;
	@Autowired
	Environment env;
	
	Log log=LogFactory.getLog(this.getClass());
	
	@PostMapping("Admin/addfare")
	public  Fare Addfare(@RequestBody Fare f) {
		log.info(env.getProperty("fa"));
		 return fs.addFare(f);
	}
	
	  @GetMapping("both/calfare/{type}/{plan}")
	 
	public String CalFare(@PathVariable("type")String s1,@PathVariable("plan")String s2) {
		return fs.CalculateFare(s1, s2);
	}
	
	
	@PutMapping("Admin/modfare")
	public  Fare UpdateFare(@RequestBody Fare f) {
    Fare u1=fs.modFare(f);
    return u1;
	}
	
	@GetMapping("User/getallfares")
	public List<Fare> getallUsers() {
		log.info(env.getProperty("ff"));
		return fs.getallFare();
	}
		
	@DeleteMapping("Admin/deletefare/{uid}")
	public String deleteUser(@PathVariable("uid") int id) throws Exception {
		if(fdao.existsById(id)) {
	  fs.DeleteFare(id);
	  return "Staff deleted sucessfully";
	}
		else {
			log.info(env.getProperty("error"));
			throw new UserException(env.getProperty("error"));
		}
	
}
}
