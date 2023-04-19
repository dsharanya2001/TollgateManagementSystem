package com.virtusa.tms.Controller;

import java.util.List;

import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.tms.Exception.UserException;
import com.virtusa.tms.dao.VehicleDao;

import com.virtusa.tms.dto.Vehicle;
import com.virtusa.tms.service.VehicleService;

@RestController
@RequestMapping("/tmstoll")
public class VehicleController {
	
	@Autowired
	VehicleService vs;
	
	@Autowired
	VehicleDao vdao;
	
	@Autowired
	Environment env;
	Log log=LogFactory.getLog(this.getClass());
	
	@PostMapping("Admin/addtoll")
	public  Vehicle addToll( @RequestBody Vehicle  v) {
		Vehicle v1=vs.addToll(v);
		log.info(env.getProperty("ta"));
		return v1;
     
	}
	/*@GetMapping("User/getalltollbytid/{tid}")
	public Vehicle getallTollbyid(@PathVariable("tid") int id) throws Exception {
		if(vdao.existsById(id)) {
		return vs.getallTollbyid(id);
	}
		else {
			log.info(env.getProperty("error"));
			throw new UserException(env.getProperty("error"));
		}
	}
	*/
	
	@GetMapping("User/getalltollbyState/{name}")
	public List<Vehicle> getallTollbyState(@PathVariable("name") String tstate) {
		log.info(env.getProperty("tf"));
		return vs.getallTollbyname(tstate);
	}
	
	@GetMapping("User/getalltollbyname/{name}")
	public Vehicle getallTollbytollname(@PathVariable("name") String tname) {
		log.info(env.getProperty("tf"));
		return vs.getallTollbytollname(tname);
	}
	
	

	@GetMapping("both/getalltolls")
	public List<Vehicle> getallToll() {
		log.info(env.getProperty("tf"));
		return vs.getallToll();
	}
	
	@DeleteMapping("Admin/deletetoll/{tid}")
	public String deleteUser(@PathVariable("tid") int id) throws Exception {
		if(vdao.existsById(id)) {
		vs.DeleteToll(id);
		log.info(env.getProperty("td"));
		  return "Toll deleted sucessfully";
	
		
	}
		else {
			log.info(env.getProperty("error"));
			throw new UserException(env.getProperty("error"));
		}

}
}
