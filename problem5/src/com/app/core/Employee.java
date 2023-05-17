package com.app.core;

import java.time.LocalDate;

public class Employee {

//	 Name, Date of joining, Phone Number, Aadhaar number
	
	private static int idGenerator;
	private int empId;
	private String name;
	private LocalDate dateOfJoining;
	private String phNumber ;
	private String AdharNumber;
	
	
	static {
		idGenerator = 1;
	}
	public Employee(String name, LocalDate dateOfJoining, String phNumber, String adharNumber) {
		super();
		this.empId = idGenerator++;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
		this.phNumber = phNumber;
		this.AdharNumber = adharNumber;
	}

	 public Employee(int id ) {
		this.empId = id;
	}
	
	@Override
	public boolean equals(Object emp) {
		
		return this.empId == ((Employee)emp).empId ;
	}
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}



	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}



	public String getPhNumber() {
		return phNumber;
	}



	public void setPhNumber(String phNumber) {
		this.phNumber = phNumber;
	}



	public String getAdharNumber() {
		return AdharNumber;
	}



	public void setAdharNumber(String adharNumber) {
		AdharNumber = adharNumber;
	}



	@Override
	public String toString() {
		return "Employee empid = " + empId + "  name=" + name + ", dateOfJoining=" + dateOfJoining + ", phNumber=" + phNumber
				+ ", AdharNumber=" + AdharNumber + "]";
	}
	
	
	
	
}
