package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.app.cricket.Cricketer;

import utils.Utility;

public class CricketerTest {

	public static void main(String[] args) {

		ArrayList<Cricketer> cricketerDB = Utility.populateData();

		try (Scanner sc = new Scanner(System.in)) {

			boolean exit = false;

			while (!exit) {
				System.out.println("1.Accept minimum 5 Cricketers in the collection." + " 2.Modify Cricketer's rating"
						+ " 3.Search Cricketer by name" + " 4. Display all Cricketers added in collection."
						+ " 5.Display All Cricketers in sorted form by rating.");
				try {
					switch (sc.nextInt()) {
					case 1:
//					String name, int age, String email_id, String phone, int rating
						System.out.println("enter a name,age,email_id,phone,rating");
						Cricketer c1 = new Cricketer(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
						cricketerDB.add(c1);
						System.out.println("cricketer added succefully");
						break;
					
					case 2: 
						System.out.println("enter a name of the cricketer you want to modify rating of");
						Cricketer cricketerTemp =new Cricketer(sc.next());
						
						if(cricketerDB.contains(cricketerTemp)) {
							int index = cricketerDB.indexOf(cricketerTemp);
							System.out.println("enter the new rating ");
							cricketerDB.get(index).setRating(sc.nextInt());
							System.out.println("update succefully");
						}else {
							// throw exception
							System.out.println("wrong name ");
						}
						break;
					case 3: 
//						3.Search Cricketer by name
						System.out.println("enter a name of the cricketer");
						cricketerTemp = new Cricketer(sc.next());
						
						if(cricketerDB.contains(cricketerTemp)) {
							
							int index = cricketerDB.indexOf(cricketerTemp);
							System.out.println(cricketerDB.get(index));
							
						}else {
							// throw exception
							System.out.println("wrong name ");
						}
						break;
					case 5: 
//						Display All Cricketers in sorted form by rating.
						Collections.sort(cricketerDB,(c7,c8)-> {
						  Integer a = ((Cricketer)c7).getRating();
						  Integer b = ((Cricketer)c8).getRating();
						  
						  return a.compareTo(b);S
						});
						break;
					case 0:
						exit = true;
						break;
					case -1:
						cricketerDB.forEach(cricketer -> System.out.println(cricketer));
						break;
					}
				} catch (Exception e) {

				}
			}
		}
	}

}
