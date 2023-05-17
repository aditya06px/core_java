package com.app.core;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {

	private double monthlySalary;
	
	public FullTimeEmployee(String name, LocalDate dateOfJoining, String phNumber, String adharNumber,double monthlySalary) {
	    super(name, dateOfJoining, phNumber,adharNumber);
		this.monthlySalary = monthlySalary;
	}
	
	public String toString() {
		return super.toString() + " monthlySalary " + this.monthlySalary ;
	}
}
