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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.tms.Exception.UserException;
import com.virtusa.tms.dao.StaffDao;
import com.virtusa.tms.dto.Staff;
import com.virtusa.tms.dto.Vehicle;
import com.virtusa.tms.service.StaffService;

@RestController
@RequestMapping("/tmsstaff")
public class StaffRestController {

	@Autowired
	StaffDao sdao;
	
	@Autowired
	StaffService ss;
	@Autowired
	Environment env;
	Log log=LogFactory.getLog(this.getClass());
	
	@PostMapping("Admin/addstaff")
	public  Staff addStaff(@RequestBody Staff s) {
	     sdao.save(s);
	     log.info(env.getProperty("sa"));
    return s;
		

	}
	@GetMapping("Admin/getallstaff")
	public List<Staff> getallstaff() {
		log.info(env.getProperty("sf"));
		return ss.getallStaff();
		
	}
	@DeleteMapping("Admin/deletestaff/{sid}")
	public String deleteUser(@PathVariable("sid") int id) throws Exception {
		if(sdao.existsById(id)) {
		ss.DeleteStaff(id);
		log.info(env.getProperty("sd"));
		  return "Staff deleted sucessfully";
		
		
	}
		else {
			log.info(env.getProperty("error"));
			throw new UserException(env.getProperty("error"));
		}
	}
	
	@GetMapping("Admin/gettollbysid/{sid}")
	public Vehicle gettollbysid(@PathVariable("sid") int id) throws Exception {
		if(sdao.existsById(id)) {
		return ss.gettollbysid(id);
	}
		else {
			log.info(env.getProperty("error"));
			throw new UserException(env.getProperty("error"));
		}
	}

	
}
