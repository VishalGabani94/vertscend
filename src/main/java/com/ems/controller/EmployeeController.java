package com.ems.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems.model.Employee;
import com.ems.services.EmployeeServices;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeServices employeeServices;

	/**
	 * GET emp/all Host: http://localhost:8080/
	 * 
	 * Validations specific extension of
	 * {@link com.ems.utilites.Validator }
	 * 
	 * return: application/json,text/javascript
	 * 
	 * @return  HttpStatus.OK List of Employee 
	 */
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		System.out.println("Get all employee...");

		List<Employee> employeeList = new ArrayList<>();
		employeeServices.findAll().forEach(employeeList::add);

		return employeeList.isEmpty() ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
				: new ResponseEntity<>(employeeList, HttpStatus.OK);
		
	}
	
	
	/**
	 * a function used for delete employee by id
	 * 
	 * DELETE emp/{1} Host: http://localhost:8080/
	 * 
	 * @param id
	 * @return HttpStatus.OK if employee deleted successfully
	 */
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable("id") int id) {
		System.out.println("Delete emp with ID = " + id + "...");

		employeeServices.deleteById(id);

		return new ResponseEntity<>("emp has been deleted!", HttpStatus.OK);

	}
	
	/**
	 *  Accept: application/json,text/javascript
	 *  
	 *  POST emp Host: http://localhost:8080/
	 *  
	 * @param employee
	 * @return employee info if inserted successfully
	 */
	@PostMapping()
	public Employee postEmployee(@RequestBody Employee employee) {
		Employee employeeObj = employeeServices.save(employee);
		return employeeObj;
	}
	
	/**
	 *  RETURN: application/json,text/javascript
	 * 
	 * PUT emp Host: http://localhost:8080/
	 * 
	 * @param employee
	 * @return employee info if modified successfully
	 */
	@PutMapping()
	public Employee putEmployee(@RequestBody Employee employee) {
		Employee employeeObj = employeeServices.save(employee);
		return employeeObj;
	}
	
	
}
