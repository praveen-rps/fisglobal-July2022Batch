package com.example.springboot.sscjpademo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ssc")
public class Ssc {
	
	@Id
	int htno;
	
	@Column
	String name;
	
	@Column
	String city;
	
	@Column
	String state;
	
	
	public Ssc() {
		
	}
	
	
	public Ssc(int htno, String name, String city, String state) {
		super();
		this.htno = htno;
		this.name = name;
		this.city = city;
		this.state = state;
	}


	public int getHtno() {
		return htno;
	}
	public void setHtno(int htno) {
		this.htno = htno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
