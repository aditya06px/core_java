package utils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.app.core.Employee;
import com.app.core.FullTimeEmployee;
import com.app.core.PartTimeEmployee;

public class PopulateData {

	public static ArrayList<Employee> populateDB() 
	{
		ArrayList<Employee> employees = new ArrayList<>();
		
//		super(name, dateOfJoining, adharNumber, phNumber);
		employees.add(new FullTimeEmployee("rahul", LocalDate.parse("2023-01-01"), "102030405012", "7849456214", 50_000));
		employees.add(new FullTimeEmployee("pranav", LocalDate.parse("2022-12-10"), "123456789098", "1245786936", 50_000));
		employees.add(new PartTimeEmployee("shivam", LocalDate.parse("2023-03-15"), "987456321065", "1246794859", 50_000));
		employees.add(new PartTimeEmployee("batman", LocalDate.parse("2022-07-05"), "12345678948", "4958464215", 50_000));

		return employees;
	}
}
