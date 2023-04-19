package com.virtusa.tms.Controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtusa.tms.Exception.UserException;
import com.virtusa.tms.dao.FastTagDao;
import com.virtusa.tms.dto.FastTag;
import com.virtusa.tms.service.FastTagService;

@RestController
@RequestMapping("/tmsfasttag")
public class FastTagController {
	@Autowired
	FastTagService fts;
	@Autowired
	FastTagDao ftdao;
	@Autowired
	Environment env;
	
	Log log=LogFactory.getLog(this.getClass());
	
	
	@PostMapping("User/recharge")
	public FastTag recharge(@RequestBody FastTag ft) {
		log.info(env.getProperty("fast"));
		return fts.rechargeacc(ft);
	}
	
	@GetMapping("User/pay/{id}/{type}/{plan}")
		public int paytoll(@PathVariable("id") int id,@PathVariable("type") String type,@PathVariable("plan")String plan)throws Exception {
		
		if(ftdao.existsById(id)) {
			return fts.paytoll(id,type,plan);
		}
		else {
			log.info(env.getProperty("error"));
			throw new UserException(env.getProperty("error"));
		}
	}
	
	@PutMapping("User/recharge/{amount}/{id}")
	public FastTag addamount(@PathVariable("amount") int amount, @PathVariable("id") int id)throws Exception {
		if(ftdao.existsById(id)) {
			log.info(env.getProperty("ad"));
		return fts.AddAmount(amount, id);
	}
		else {
			log.info(env.getProperty("error"));
			throw new UserException(env.getProperty("error"));
		}
	}
	

  @GetMapping("User/modft")
  public FastTag modft(@RequestBody FastTag ft)throws Exception {
		log.info(env.getProperty("mod"));
		return fts.modft(ft);
	}
  
  @GetMapping("User/getft/{id}")
  public FastTag getft(@PathVariable("id") int id)throws Exception {
	 
	  if(ftdao.existsById(id)) {
		return fts.getuserbyft(id);
	}
	  else {
			log.info(env.getProperty("error"));
			throw new UserException(env.getProperty("error"));
		}

}
	}
  


