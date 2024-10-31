package com.appswallet.ems.dao;

import java.util.List;

import com.appswallet.ems.model.Employee;

public interface EmployeeDao {
	
	int save(Employee employee);
	int update(Employee employee);
	int delete(int id);
	List<Employee> getAll();
	Employee getById(int id);

}
