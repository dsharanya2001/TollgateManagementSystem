package com.virtusa.tms.dto;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Plan")
public class Plan {

	@Id
	@Column(name="fid")
	int id;
	@Column(name="fjourney",length=20)
	String single_journey;
		@Column(name="fdailypass",length=20)
	String daily_pass;
		@Column(name="ffiftypass",length=20)
	String fifty_pass;
		@Column(name="fmonthly",length=20)
	String monthly;
		
		@OneToOne()
		@JsonIgnore
		Fare f;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSingle_journey() {
			return single_journey;
		}

		public void setSingle_journey(String single_journey) {
			this.single_journey = single_journey;
		}

		public String getDaily_pass() {
			return daily_pass;
		}

		public void setDaily_pass(String daily_pass) {
			this.daily_pass = daily_pass;
		}

		public String getFifty_pass() {
			return fifty_pass;
		}

		public void setFifty_pass(String fifty_pass) {
			this.fifty_pass = fifty_pass;
		}

		public String getMonthly() {
			return monthly;
		}

		public void setMonthly(String monthly) {
			this.monthly = monthly;
		}

		public Fare getF() {
			return f;
		}

		public void setF(Fare f) {
			this.f = f;
		}

		public Plan(int id, String single_journey, String daily_pass, String fifty_pass, String monthly, Fare f) {
			super();
			this.id = id;
			this.single_journey = single_journey;
			this.daily_pass = daily_pass;
			this.fifty_pass = fifty_pass;
			this.monthly = monthly;
			this.f = f;
		}

		@Override
		public String toString() {
			return "Plan [id=" + id + ", single_journey=" + single_journey + ", daily_pass=" + daily_pass
					+ ", fifty_pass=" + fifty_pass + ", monthly=" + monthly + ", f=" + f + "]";
		}

		public Plan() {
			super();
		}
		
		
		
		
}
