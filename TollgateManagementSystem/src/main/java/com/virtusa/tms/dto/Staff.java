package com.virtusa.tms.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Staff")

public class Staff {

	    @Id
	 
	  	 @Column(name="id")
	    int id;
	    @Column(name="sname",length=20)
		String name;
	    @Column(name="saddress",length=40)
		String address;
	    @Column(name="ssalary",length=20)
		String salary;
	    @Column(name="sphonenum",length=20)
		String phonenum;
	    @Column(name="sdate",length=20)
		String date;
	    @Column(name="semail",length=20)
		String email;
	    @Column(name="branchno")
		int bno;
	  
	    @OneToOne(cascade=CascadeType.ALL,mappedBy="s")
	    @JsonIgnore
	    Vehicle v;
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
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		public String getPhonenum() {
			return phonenum;
		}
		public void setPhonenum(String phonenum) {
			this.phonenum = phonenum;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getBno() {
			return bno;
		}
		public void setBno(int bno) {
			this.bno = bno;
		}
		public Vehicle getV() {
			return v;
		}
		public void setV(Vehicle v) {
			this.v = v;
		}
		@Override
		public String toString() {
			return "Staff [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", phonenum="
					+ phonenum + ", date=" + date + ", email=" + email + ", bno=" + bno + ", v=" + v + "]";
		}
		public Staff(int id, String name, String address, String salary, String phonenum, String date, String email,
				int bno, Vehicle v) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.salary = salary;
			this.phonenum = phonenum;
			this.date = date;
			this.email = email;
			this.bno = bno;
			this.v = v;
		}
		public Staff() {
			super();
		}
		
	    
	    
	   


}
		


