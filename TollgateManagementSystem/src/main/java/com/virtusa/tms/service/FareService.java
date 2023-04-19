package com.virtusa.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.tms.dao.FareDao;

import com.virtusa.tms.dto.Fare;
import com.virtusa.tms.dto.Plan;
import com.virtusa.tms.dto.User;

@Service
public class FareService {

	@Autowired
    FareDao fdao;
	
	public Fare  addFare(Fare f) {
     return fdao.save(f);
      
	}
	public void  DeleteFare(int id) {
	    fdao.deleteById(id);
		}
	
	public List<Fare> getallFare(){
	List<Fare> ul=	fdao.findAll();
	return ul;
	}
	public Fare modFare(Fare f) {
		
		   return fdao.save(f);
	}
	
	public String CalculateFare(String s1,String s2) {
		
		if(s2.equals("single_journey")) {
		Fare f=fdao.getfarebytype(s1);
		return f.getP().getSingle_journey();
		
		}
		
		if(s2.equals("daily_pass")) {
			Fare f=fdao.getfarebytype(s1);
			return f.getP().getDaily_pass();
			
			}
		
		if(s2.equals("fifty_pass")) {
			Fare f=fdao.getfarebytype(s1);
			return f.getP().getFifty_pass();
			
			}
		
		if(s2.equals("monthly")) {
			Fare f=fdao.getfarebytype(s1);
			return f.getP().getMonthly();
			
			}
		return null;
		
		
	}
	
	
	
}
