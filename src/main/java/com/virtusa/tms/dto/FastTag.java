package com.virtusa.tms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FastTag")
public class FastTag {
	
	@Id
	
	@Column(name="fastagid")
	int fastagid;
	@Column(name="fname",length=20)
	String fname;
	@Column(name="rechargeamount")
	int rechargeAmount;
	@Column(name="femail",length=20)
	String femail;
	@Column(name="fvehiclenum",length=20)
	String fvehiclenum;

	public FastTag() {
		super();
	}
	
	@Override
	public String toString() {
		return "FastTag [fastagid=" + fastagid + ", fname=" + fname + ", rechargeAmount=" + rechargeAmount + ", femail="
				+ femail + ", fvehiclenum=" + fvehiclenum + "]";
	}
	public FastTag(int fastagid, String fname, int rechargeAmount, String femail, String fvehiclenum) {
		super();
		this.fastagid = fastagid;
		this.fname = fname;
		this.rechargeAmount = rechargeAmount;
		this.femail = femail;
		this.fvehiclenum = fvehiclenum;
	}
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public int getRechargeAmount() {
		return rechargeAmount;
	}
	public void setRechargeAmount(int rechargeAmount) {
		this.rechargeAmount = rechargeAmount;
	}
	public String getFemail() {
		return femail;
	}
	public void setFemail(String femail) {
		this.femail = femail;
	}
	public String getFvehiclenum() {
		return fvehiclenum;
	}
	public void setFvehiclenum(String fvehiclenum) {
		this.fvehiclenum = fvehiclenum;
	}
	public int getFastagid() {
		return fastagid;
	}
	public void setFastagid(int fastagid) {
		this.fastagid = fastagid;
	}
	
	
}
