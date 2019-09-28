package com.example.demo.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.model.Employee;

@RestResource
public interface EmployeeDao  extends JpaRepository<Employee, String>{
	
}