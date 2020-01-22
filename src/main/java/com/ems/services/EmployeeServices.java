package com.ems.services;

import java.util.List;

import com.ems.model.Employee;

public interface EmployeeServices {

	List<Employee> findAll();

	void deleteById(int id);

	Employee save(Employee employee);

}
