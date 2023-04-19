package com.virtusa.tms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.virtusa.tms.dao.LoginDao;
import com.virtusa.tms.dto.Login;


public class LoginService {

	
    @Autowired
	LoginDao ldao;
	
	public Login  addAdmin(Login l) {
		
	       return ldao.save(l);
		}
	
	public  Login ValidateAdmin(String a,String b){
		 Login  u=ldao.validateUser(a, b);
		return u;
					}
}
