package com.virtusa.tms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Login {
	@Id
	@Column(name="id")
	int id;
	@Column(name="uname",length=20)
String userName;
	@Column(name="pass",length=20)
String password;

public Login() {
	super();
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Login(int id, String userName, String password) {
	super();
	this.id = id;
	this.userName = userName;
	this.password = password;
}

@Override
public String toString() {
	return "Login [id=" + id + ", userName=" + userName + ", password=" + password + "]";
}





}
