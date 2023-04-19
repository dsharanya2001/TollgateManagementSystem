package com.virtusa.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.virtusa.tms.dto.Login;
import com.virtusa.tms.dto.User;


public interface LoginDao extends JpaRepository<Login, Integer>{

	
	
	@Query("select u  from Login u where u.userName=:p1 and u.password=:p2")
	public Login validateUser(@Param("p1")String email,@Param("p2")String pass);
}
