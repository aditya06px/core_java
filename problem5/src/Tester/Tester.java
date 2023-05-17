package Tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.app.core.Employee;
import com.app.core.FullTimeEmployee;

import exceptions.InvalidInputException;
import utils.PopulateData;
import validations.ValidateData;

public class Tester {

	public static void main(String[] args) {

		ArrayList<Employee> employeeDB = PopulateData.populateDB();
		boolean exit = false;

		try (Scanner sc = new Scanner(System.in)) {

			while (!exit) {
				System.out.println("1. Add full time employee\r\n" + " 2. Add part time employee\r\n"
						+ " 3. Delete an employee by Emp Id\r\n" + " 4. Search employee details by Aadhaar number\r\n"
						+ " 5. Display all employee details\r\n"
						+ " 6. Display all employee details sorted by date of joining\r\n" + " 7. Exit");

				try {
					switch (sc.nextInt()) {

					case 1:

						sc.nextLine();
						System.out.println("enter the name of the employee");
						String name = sc.nextLine();

//						sc.nextLine();
						System.out.println("enter a joining date");
						String dateInput = sc.next();
						
						LocalDate date = ValidateData.checkDateOfJoining(dateInput);

						System.out.println("enter a phone number");
						String phNumber = sc.next();
						ValidateData.validatePhNumber(phNumber);
						
						System.out.println("enter a adhar number");
						String adharNumber = sc.next();
						ValidateData.validateAdharNumber(adharNumber);
						ValidateData.checkForDuplicateAdharNumber(employeeDB,adharNumber);
						
						System.out.println("enter monthly salary");
						Double sal = sc.nextDouble();
						
					System.out.println(name + " name ");	
					 FullTimeEmployee f1 = new FullTimeEmployee(name, date, phNumber, adharNumber, sal);
					 employeeDB.add(f1);
					 System.out.println("employee added succefully");

					 
						break;
					case 2: 
						sc.nextLine();
						System.out.println("enter the name of the employee");
						 name = sc.nextLine();

//						sc.nextLine();
						System.out.println("enter a joining date");
						 dateInput = sc.next();
						
						 date = ValidateData.checkDateOfJoining(dateInput);

						System.out.println("enter a phone number");
						 phNumber = sc.next();
						ValidateData.validatePhNumber(phNumber);
						
						System.out.println("enter a adhar number");
						 adharNumber = sc.next();
						ValidateData.validateAdharNumber(adharNumber);
						ValidateData.checkForDuplicateAdharNumber(employeeDB,adharNumber);
						
						System.out.println("enter monthly salary");
						 sal = sc.nextDouble();
						
					System.out.println(name + " name ");	
					  f1 = new FullTimeEmployee(name, date, phNumber, adharNumber, sal);
					 employeeDB.add(f1);
					 System.out.println("employee added succefully");
						break;
					
					case 3: 
						System.out.println("enter the employee id you want to delete");
						int id4 = sc.nextInt();
					
						Employee emp = new Employee(id4);
						if(employeeDB.contains(emp)) {
						  int index = employeeDB.indexOf(emp);
						  employeeDB.remove(index);
						  System.out.println("employee removed succefully");
						}else {
							throw new InvalidInputException("employee doesn't exists");
						}
						break;
					case 4: 
						System.out.println("sorted by doj");
						Collections.sort(employeeDB,(r1,r2)-> {
							return ((Employee)r1).getDateOfJoining().compareTo(((Employee)r2).getDateOfJoining());
						});
						break;
					case 5:
						employeeDB.forEach(e -> System.out.println(e));
						break;
					case 7: 
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
