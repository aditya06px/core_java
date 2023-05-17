package com.app.core;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import exceptions.InvalidInputException;
import validations.ValidateData;

public class EmployeeHelper  {

	public static void addFullTimeEmployee(ArrayList<Employee>employeeDB) throws InvalidInputException {
       try (Scanner sc = new Scanner(System.in)){
		System.out.println("enter the name of the employee");
		String name = sc.nextLine();

		System.out.println("enter a joining date");
		LocalDate date = ValidateData.checkDateOfJoining(sc.next());

		System.out.println("enter a phone number");
		String phNumber = sc.next();
		ValidateData.validatePhNumber(phNumber);
		
		System.out.println("enter a adhar number");
		String adharNumber = sc.next();
		ValidateData.validateAdharNumber(adharNumber);
		ValidateData.checkForDuplicateAdharNumber(employeeDB,adharNumber);
		
		System.out.println("enter monthly salary");
		Double sal = sc.nextDouble();
	 FullTimeEmployee f1 = new FullTimeEmployee(name, date, phNumber, adharNumber, sal);
       }catch(Exception e) {
    	  e.printStackTrace();
       }
	 
	}


}
