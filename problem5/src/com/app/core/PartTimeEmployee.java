package com.app.core;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee{

private double hourlySalary;
	
	public PartTimeEmployee(String name, LocalDate dateOfJoining, String phNumber, String adharNumber,double hourlySalary) {
		super(name, dateOfJoining, adharNumber, phNumber);
		this.hourlySalary = hourlySalary;
	}
	
	public String toString() {
		return super.toString() + " monthlySalary " + this.hourlySalary ;
	}
}
