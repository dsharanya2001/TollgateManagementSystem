package com.virtusa.tms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.tms.Exception.UserException;
import com.virtusa.tms.dao.FastTagDao;
import com.virtusa.tms.dto.FastTag;

@Service
public class FastTagService {
	

	@Autowired
	FastTagDao ftdao;
	
	@Autowired
	FareService fs;
	
	
	public FastTag rechargeacc(FastTag ft)  {
    return  ftdao.save(ft);
	}
	
	public  int paytoll(int fid,String type,String plan)throws Exception {
		int result=0;
		
		String s=fs.CalculateFare(type,plan);
		
		int n=Integer.parseInt(s);
		
		FastTag ft=ftdao.findById(fid).get();
		
	int amount=	ft.getRechargeAmount();
	if(amount>=n) {
		result=amount-n;
		ft.setRechargeAmount(result);
		ftdao.save(ft);
		return result;
	}
	else {
		throw new UserException("Insufficient funds");
	}	
	}
	
	
	public FastTag modft(FastTag ft) {
		
		return ftdao.save(ft);
		
	}
	
	public FastTag getuserbyft(int id) {
	Optional< FastTag>ft=	ftdao.findById(id);
	 return ft.get();
	}
	
	
	public FastTag AddAmount(int amount,int id) {
	FastTag ft=	ftdao.findById(id).get();
int a=	ft.getRechargeAmount();
	int res=a+amount;
	ft.setRechargeAmount(res);
	ftdao.save(ft);
	return ft;
	
		
	}
	
	
}
