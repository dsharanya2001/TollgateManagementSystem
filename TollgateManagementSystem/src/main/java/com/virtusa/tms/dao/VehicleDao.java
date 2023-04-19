package com.virtusa.tms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.virtusa.tms.dto.User;
import com.virtusa.tms.dto.Vehicle;

@Repository
public interface VehicleDao extends JpaRepository<Vehicle, Integer>  {
	
	@Query("select v from Vehicle v where v.state=:p1")
	public List<Vehicle> gettollbyState(@Param("p1")String s);
	
	
	@Query("select v from Vehicle v where v.toll_name=:p1")
	public Vehicle gettollbyname(@Param("p1")String s);
	

}
