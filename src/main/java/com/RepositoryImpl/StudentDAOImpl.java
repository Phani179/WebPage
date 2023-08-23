package com.RepositoryImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.Repository.StudentDAO;
import com.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO
{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int saveUser(Student student) 
	{
		int rows = jdbcTemplate.update("INSERT INTO student_info VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);",
				student.getName(),
				student.getRegister_No(),
				student.getDate_of_birth(),
				student.getSex(),
				student.getCommunity(),
				student.getPhysically_challanged(),
				student.getAddress(),
				student.getPhone_number(),
				student.getAadhar_number(),
				student.getEmail_id(),
				student.getDegree_qualified(),
				student.getYear_of_passing(),
				student.getBranch(),
				student.getYear_of_admission(),
				student.getName_of_College()
				);
		return rows;
	}
	
//	  Name VARCHAR(35),
//    Register_No INT,
//    Date_of_Birth DATE,
//    Sex ENUM('Male','Female'),
//    Community VARCHAR(5),
//    Physically_Challanged ENUM("Yes","No"),
//    Address VARCHAR(100),
//    Phone_Number INT,
//    Aadhar_Number INT,
//    Email_id VARCHAR(30),
//    Degree_Qualified VARCHAR(10),
//    Year_of_Passing INT,
//    Branch VARCHAR(20),
//    Year_of_Admission INT,
//    Name_of_College VARCHAR(50)

}
