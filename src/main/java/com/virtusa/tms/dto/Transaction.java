package com.virtusa.tms.dto;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Transaction")
public class Transaction {
     
	
	@Id
	@Column(name="tid")
	 int trans_id;
	@Column(name="vnum",length=20)
	 String vehicleNumber;
	@Column(name="type",length=40)
	 String type;
	@Column(name="plan",length=40)
	 String plan;
	@Column(name="date",length=40)
	 String date;
	@Column(name="amount")
	int amount;
	@Column(name="toll_name",length=40)
	 String nameToll;
	@Column(name="trans_type",length=20)
	 String transtype;
	
	@ManyToOne()
	
	User u;

	public int getTrans_id() {
		return trans_id;
	}

	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getNameToll() {
		return nameToll;
	}

	public void setNameToll(String nameToll) {
		this.nameToll = nameToll;
	}

	public String getTranstype() {
		return transtype;
	}

	public void setTranstype(String transtype) {
		this.transtype = transtype;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

	public Transaction(int trans_id, String vehicleNumber, String type, String plan, String date, int amount,
			String nameToll, String transtype, User u) {
		super();
		this.trans_id = trans_id;
		this.vehicleNumber = vehicleNumber;
		this.type = type;
		this.plan = plan;
		this.date = date;
		this.amount = amount;
		this.nameToll = nameToll;
		this.transtype = transtype;
		this.u = u;
	}

	public Transaction() {
		super();
	}

	@Override
	public String toString() {
		return "Transaction [trans_id=" + trans_id + ", vehicleNumber=" + vehicleNumber + ", type=" + type + ", plan="
				+ plan + ", date=" + date + ", amount=" + amount + ", nameToll=" + nameToll + ", transtype=" + transtype
				+ ", u=" + u + "]";
	}
	
	
	
}
	
	