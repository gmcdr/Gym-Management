package com.blackroots.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackroots.admin.repository.StudentRepository;

@Service
public class StudentService {
		
	@Autowired
	private StudentRepository repository;
	
}
