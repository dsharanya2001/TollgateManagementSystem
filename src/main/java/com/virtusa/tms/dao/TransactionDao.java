package com.virtusa.tms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.virtusa.tms.dto.Fare;
import com.virtusa.tms.dto.Transaction;


@Repository
public interface TransactionDao extends JpaRepository<Transaction, Integer> {

	
	
	@Query("select t from Transaction t where t.transtype=:p1")
	public List<Transaction> getusersbytype(@Param("p1")String s);

	

	
}
