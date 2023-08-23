package com.Repository;

import org.springframework.stereotype.Repository;
import org.w3c.dom.UserDataHandler;

import com.entity.Student;

@Repository
public interface StudentDAO 
{
	public int saveUser(Student student);
}
