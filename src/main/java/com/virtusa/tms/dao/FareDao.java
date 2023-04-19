package com.virtusa.tms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.virtusa.tms.dto.Fare;
import com.virtusa.tms.dto.Vehicle;

@Repository
public interface FareDao extends JpaRepository<Fare, Integer> {
	
	@Query
	("select f from Fare f where f.type=:p1")
	public Fare getfarebytype(@Param("p1")String s1);
	

	//Query("select p1 from Fare f where f.type=:p2")
	//public String calFare(@Param("p1")String s1,@Param("p2")String s2);

}
