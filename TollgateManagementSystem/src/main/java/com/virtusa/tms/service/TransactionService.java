package com.virtusa.tms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.virtusa.tms.dao.TransactionDao;
import com.virtusa.tms.dto.Fare;
import com.virtusa.tms.dto.Transaction;


@Service
public class TransactionService {

	@Autowired
	TransactionDao tdao;
	
	public Transaction  addTrans(Transaction t) {
	       return tdao.save(t);
		}
	
	public List<Transaction > getallTrans(){
		List<Transaction> ul1 = tdao.findAll();
		return ul1;
		}
	
	public List<Transaction> getusersbytype(String s) {
		return tdao.getusersbytype(s);
	}
	
	
}
