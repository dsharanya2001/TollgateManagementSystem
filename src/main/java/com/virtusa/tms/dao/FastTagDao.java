package com.virtusa.tms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.tms.dto.FastTag;

@Repository
public interface FastTagDao extends JpaRepository<FastTag, Integer> {
	
	

}
