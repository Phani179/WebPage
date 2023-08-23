package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Student;
import com.service.impl.SaveUserImpl;

@Controller
public class LoginController 
{
	@Autowired
	Student student;
	
	@Autowired
	SaveUserImpl saveUserImpl;
	
	@RequestMapping("/create")
	public String hello(HttpServletRequest ir)
	{
		student.setName(ir.getParameter("Name"));
		student.setRegister_No(Long.parseLong(ir.getParameter("Registration_Number")));
		student.setDate_of_birth(ir.getParameter("Date_of_Birth"));
		student.setSex(ir.getParameter("Sex"));
		student.setCommunity(ir.getParameter("Community"));
		student.setPhysically_challanged(ir.getParameter("Physically_challanged"));
		student.setAddress(ir.getParameter("Address"));
		student.setPhone_number(Long.parseLong(ir.getParameter("Phone_number")));
		student.setAadhar_number(Long.parseLong(ir.getParameter("Aadhar_number")));
		student.setEmail_id(ir.getParameter("Email_Id"));
		student.setDegree_qualified(ir.getParameter("degree_qualified"));	
		student.setYear_of_passing(Integer.parseInt(ir.getParameter("year_of_passing")));	
		student.setBranch(ir.getParameter("Branch"));	
		student.setYear_of_admission(Integer.parseInt(ir.getParameter("year_of_admission")));	
		student.setName_of_College(ir.getParameter("name_of_the_college"));	
		int rows = saveUserImpl.saveUser(student);
		System.out.println("rows updated : "+rows);
		return "Hello";
	}
}
