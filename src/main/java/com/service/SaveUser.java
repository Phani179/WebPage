package com.service;

import org.springframework.stereotype.Service;

import com.entity.Student;

@Service
public interface SaveUser 
{
	public int saveUser(Student student);
}
