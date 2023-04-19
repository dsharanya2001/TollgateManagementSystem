package com.virtusa.tms.dto;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Fare")
public class Fare {
	
	public Fare() {
		super();
	}

	@Id
	@Column(name="fareid")
int id;
	@Column(name="ftype",length=40)
String type;
	 
	@OneToOne(cascade=CascadeType.ALL,mappedBy="f")
	
	Plan p;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Plan getP() {
		return p;
	}

	public void setP(Plan p) {
		this.p = p;
	}

	public Fare(int id, String type, Plan p) {
		super();
		this.id = id;
		this.type = type;
		this.p = p;
	}

	@Override
	public String toString() {
		return "Fare [id=" + id + ", type=" + type + ", p=" + p + "]";
	}
	
	
	
	
}