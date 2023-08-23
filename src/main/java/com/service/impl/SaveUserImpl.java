package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RepositoryImpl.StudentDAOImpl;
import com.entity.Student;
import com.service.SaveUser;

@Service
public class SaveUserImpl implements SaveUser
{
	@Autowired
	StudentDAOImpl studentDAOImpl;

	@Override
	public int saveUser(Student student) 
	{
		return studentDAOImpl.saveUser(student);
	}
}
