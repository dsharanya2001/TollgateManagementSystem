package com.virtusa.tms.Controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.tms.dao.FareDao;
import com.virtusa.tms.dao.TransactionDao;
import com.virtusa.tms.dto.Fare;
import com.virtusa.tms.dto.Transaction;
import com.virtusa.tms.service.TransactionService;


@RestController
@RequestMapping("/tmstrans")
public class TransactionRestController {
	@Autowired(required = false)
	TransactionDao tdao;
	@Autowired
	TransactionService ts;
	
	@Autowired
	FareDao fdao;
	
	@Autowired
	Environment env;
	Log log=LogFactory.getLog(this.getClass());
	
	@PostMapping("both/addtrans")
	public  Transaction addTrans(@RequestBody Transaction t) {
		log.info(env.getProperty("tra"));
		return ts.addTrans(t);
	}
	
	@GetMapping("Admin/getalltrans")
	public List<Transaction> getallstaff() {
		log.info(env.getProperty("trf"));
		return ts.getallTrans();
	}
  
	@GetMapping("Staff/getusersbytype/{type}")
	public List<Transaction> getallonlineusers(@PathVariable("type") String s) {
		log.info(env.getProperty("trf"));
		return ts.getusersbytype(s);
	}
	
	
	
}
