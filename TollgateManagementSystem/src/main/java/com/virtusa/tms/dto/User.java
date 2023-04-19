package com.virtusa.tms.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users")
public class User {
	@Id
	
	@Column(name="uid")
	int id ;
	@Column(name="uname",length=20)
String name;
	@Column(name="upassword",length=20)
String password;
	@Column(name="ucity",length=20)
String city;
	@Column(name="upnum",length=20)
String phonenumber;
	@Column(name="uvnum",length=20)
String vehicleNumber;
	@Column(name="uemail",length=40)
String email;
	

	@OneToMany(cascade=CascadeType.ALL,mappedBy="u")
	@JsonIgnore
	List<Transaction> trans=new ArrayList<Transaction>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Transaction> getTrans() {
		return trans;
	}
	public void setTrans(List<Transaction> trans) {
		this.trans = trans;
	}
	public User(int id, String name, String password, String city, String phonenumber, String vehicleNumber,
			String email, List<Transaction> trans) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.city = city;
		this.phonenumber = phonenumber;
		this.vehicleNumber = vehicleNumber;
		this.email = email;
		this.trans = trans;
	}
	public User() {
		super();
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", city=" + city + ", phonenumber="
				+ phonenumber + ", vehicleNumber=" + vehicleNumber + ", email=" + email + "]";
	}
	
}
	
	

	