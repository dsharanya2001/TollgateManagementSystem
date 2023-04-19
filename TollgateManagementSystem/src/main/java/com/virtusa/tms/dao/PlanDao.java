package com.virtusa.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.virtusa.tms.dto.Fare;
import com.virtusa.tms.dto.Plan;

 @Repository
public interface PlanDao extends JpaRepository<Plan, Integer> {

	
		
} 


