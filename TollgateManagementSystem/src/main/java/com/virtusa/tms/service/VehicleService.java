package com.virtusa.tms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.virtusa.tms.Exception.UserException;
import com.virtusa.tms.dao.FareDao;
import com.virtusa.tms.dao.VehicleDao;
import com.virtusa.tms.dto.Fare;
import com.virtusa.tms.dto.Vehicle;

@Service
public class VehicleService {
	
	@Autowired
	VehicleDao vdao;
	
	@Autowired
	FareDao fdao;
	
	public Vehicle  addToll(Vehicle v) {
	       return vdao.save(v);
		}
		
		
		public Vehicle modToll(Vehicle v) {
			
			   return vdao.save(v);
		}
		
		/*public  Vehicle getallTollbyid(int tno) throws Exception{
			
			if(vdao.existsById(tno)) {
			Optional<Vehicle>v1= vdao.findById(tno);
			return v1.get();
		
		}
			else {
				throw new UserException("sorry id toll does not exist");
			  }
		}
		*/
		
		public List<Vehicle> getallTollbyname(String name){
			List<Vehicle>v1=	vdao.gettollbyState(name);
			return v1;
			}
			
		public Vehicle getallTollbytollname(String name){
		Vehicle v1=	vdao.gettollbyname(name);
			return v1;
			}
		
		
		
		public List<Vehicle> getallToll(){
		List<Vehicle> ul=	vdao.findAll();
		return ul;
		}
		
		
		
		public void  DeleteToll(int id) throws Exception {
			if(vdao.existsById(id)) { 
				Optional<Vehicle> v=vdao.findById(id);
		         vdao.deleteById(id);
		       
			}
			else {
				throw new UserException("sorry id  does not exist");
			}
		}					
			}


