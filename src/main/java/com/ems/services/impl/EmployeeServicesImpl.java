package com.ems.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ems.model.Employee;
import com.ems.repository.EmployeeRepository;
import com.ems.services.EmployeeServices;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public void deleteById(int id) {
		 employeeRepository.deleteById(id);
	}

	@Override
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

}
