package utils;

import java.util.ArrayList;

import com.app.cricket.Cricketer;
import com.app.tester.Integer;

public class Utility {

	public static ArrayList<Cricketer> populateData() {

		ArrayList<Cricketer> db = new ArrayList<>();
//		String name, int age, String email_id, String phone, int rating
		
		Cricketer c1 = new Cricketer("sachin",50,"sachin@gmail.com","0124567814",10);
		db.add(c1);
		
		c1 = new Cricketer("virat",35,"virat@gmail.com","3957745480",9);
		db.add(c1);
		
		c1 = new Cricketer("gambhir",39,"gambhir@gmail.com","1416574892",8);
		db.add(c1);
		
		c1 = new Cricketer("dhoni",39,"dhoni@gmail.com","9574875421",10);
		db.add(c1);
		
		
		return db;
	}
}
