package com.entity;

import org.springframework.stereotype.Component;

@Component
public class Student 
{
	String name;
    long register_No;
    String date_of_birth;
    String sex;
    String community;
    String physically_challanged;
    String address;
    long phone_number;
    long aadhar_number;
    String email_id;
    String degree_qualified;
    int year_of_passing;
    String branch;
    int year_of_admission;
    String Name_of_College;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRegister_No() {
		return register_No;
	}
	public void setRegister_No(long register_No) {
		this.register_No = register_No;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public String getPhysically_challanged() {
		return physically_challanged;
	}
	public void setPhysically_challanged(String physically_challanged) {
		this.physically_challanged = physically_challanged;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public long getAadhar_number() {
		return aadhar_number;
	}
	public void setAadhar_number(long aadhar_number) {
		this.aadhar_number = aadhar_number;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getDegree_qualified() {
		return degree_qualified;
	}
	public void setDegree_qualified(String degree_qualified) {
		this.degree_qualified = degree_qualified;
	}
	public int getYear_of_passing() {
		return year_of_passing;
	}
	public void setYear_of_passing(int year_of_passing) {
		this.year_of_passing = year_of_passing;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getYear_of_admission() {
		return year_of_admission;
	}
	public void setYear_of_admission(int year_of_admission) {
		this.year_of_admission = year_of_admission;
	}
	public String getName_of_College() {
		return Name_of_College;
	}
	public void setName_of_College(String name_of_College) {
		Name_of_College = name_of_College;
	}
}
