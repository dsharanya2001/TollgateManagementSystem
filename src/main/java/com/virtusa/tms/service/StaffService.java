package com.virtusa.tms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.tms.Exception.UserException;
import com.virtusa.tms.dao.StaffDao;
import com.virtusa.tms.dao.VehicleDao;
import com.virtusa.tms.dto.Staff;
import com.virtusa.tms.dto.Transaction;
import com.virtusa.tms.dto.Staff;
import com.virtusa.tms.dto.Vehicle;


@Service
public class StaffService {

	@Autowired
	StaffDao sdao;
	
	@Autowired
	VehicleDao vdao;
	
	public Staff  addStaff(Staff s) {
       return sdao.save(s);
	}
	
	public void  DeleteStaff(int id) throws Exception {
		if(sdao.existsById(id)) { 
			Optional<Staff> s=  sdao.findById(id);
			sdao.deleteById(id);
	       
		}
		else {
			throw new UserException("sorry id  does not exist");
		}
	}
	
	public List<Staff> getallStaff(){
	List<Staff> ul=	sdao.findAll();
	return ul;
	}
	
	public Vehicle gettollbysid(int id) {
		return sdao.findById(id).get().getV();
		
	}
	

		}
	

