package com.appswallet.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appswallet.ems.dao.EmployeeDao;
import com.appswallet.ems.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeDao dao;
	
	@GetMapping("/employee")
	public List<Employee> getAll(){
		return dao.getAll();
	}
}
