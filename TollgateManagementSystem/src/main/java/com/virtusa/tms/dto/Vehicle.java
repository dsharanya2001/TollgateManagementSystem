package com.virtusa.tms.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="TollDetails")
public class Vehicle {

	@Id
	@Column(name="tno")
int toll_no;
	@Column(name="toll_name")
	String toll_name;
	@Column(name="state",length=20)
String state;
	@Column(name="nh_num")
     int NH_num;
	@Column(name="kms")
     int kms;
	@Column(name="section",length=40)
String section;
	
	@OneToOne()
	Staff s;

	public int getToll_no() {
		return toll_no;
	}

	public void setToll_no(int toll_no) {
		this.toll_no = toll_no;
	}

	public String getToll_name() {
		return toll_name;
	}

	public void setToll_name(String toll_name) {
		this.toll_name = toll_name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getNH_num() {
		return NH_num;
	}

	public void setNH_num(int nH_num) {
		NH_num = nH_num;
	}

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public Staff getS() {
		return s;
	}

	public void setS(Staff s) {
		this.s = s;
	}

	public Vehicle(int toll_no, String toll_name, String state, int nH_num, int kms, String section, Staff s) {
		super();
		this.toll_no = toll_no;
		this.toll_name = toll_name;
		this.state = state;
		NH_num = nH_num;
		this.kms = kms;
		this.section = section;
		this.s = s;
	}

	@Override
	public String toString() {
		return "Vehicle [toll_no=" + toll_no + ", toll_name=" + toll_name + ", state=" + state + ", NH_num=" + NH_num
				+ ", kms=" + kms + ", section=" + section + ", s=" + s + "]";
	}

	public Vehicle() {
		super();
	}
	



}
