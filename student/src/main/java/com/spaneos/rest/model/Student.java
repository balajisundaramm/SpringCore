package com.spaneos.rest.model;

import java.util.Date;

public class Student {
	private int regNo;
	private String name;
	private String branch;
	private Date dob;
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", name=" + name + ", branch=" + branch + ", dob=" + dob + "]";
	}
	
	
}