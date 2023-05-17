package validations;

import java.time.LocalDate;
import java.util.ArrayList;

import com.app.core.Employee;

import exceptions.InvalidInputException;

public class ValidateData {

	
	public static void validatePhNumber(String phNumber) throws InvalidInputException {
		
		if(phNumber.matches("[0-9]{10}")) {
			return;
		}else {
			throw new InvalidInputException("phone number is invalid");
		}
	}
	
	public static void validateAdharNumber(String adharNumber) throws InvalidInputException {
		
		if(adharNumber.matches("[0-9]{12}")) {
			return;
		}else {
			throw new InvalidInputException("adharNumber is invalid");
		}
	}

	public static LocalDate checkDateOfJoining(String date) {
		
		return LocalDate.parse(date);
	}

	public static void checkForDuplicateAdharNumber(ArrayList<Employee> employeeDB, String adharNumber) 
	throws InvalidInputException
	{
		
		for(Employee e: employeeDB) {
			if(e.getAdharNumber().equals(adharNumber)) {
				throw new InvalidInputException("adhar already exists");
			}
		}
		
	}
}
