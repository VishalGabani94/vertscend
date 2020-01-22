package com.ems.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name =  "id")
	private int id;
	
	@Column(name = "ename")
	private String ename;
	
	@Column(name = "gender")
	private char gender;
	
	@Column(name = "DOB")
	private Date dob;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	@Column(name = "emp_dept")
	private String empDept;
	
	@CreationTimestamp
	private Timestamp dateOfJoining;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public Timestamp getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Timestamp dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	
	
	
}
