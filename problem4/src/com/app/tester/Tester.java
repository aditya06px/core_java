package com.app.tester;

import java.util.ArrayList;
import java.util.Locale.Category;
import java.util.Scanner;

import com.app.pet.CategoryEnum;
import com.app.pet.Order;
import com.app.pet.Pet;
import com.app.utils.UtilityClass;

public class Tester {

	public static void main(String []args) {
		
		boolean exit = false;
		boolean adminFlag = false;
		boolean customerFlag = false;
		
//		(loginId=admin, password = admin)
//		Customer (loginId=c1, password=c1)
		
		String adminLoginId = "admin";
		String adminPassword = "admin";
		
		String customerLoginId = "c1";
		String customerPassword = "c1";
		
		ArrayList<Pet> petDB = UtilityClass.populatePetDB();
		ArrayList<Order> ordersDB = UtilityClass.populateOrderDB();
		
		
	
		try(Scanner sc = new Scanner(System.in)) {
//			
			while(!exit) {
//				
				System.out.println("0.Login  1.Add new Pet (Admin only functionality) "
						+ " 2. Update Pet details (Admin only functionality)\n"
						+ " 3. Display all available pets "
						+ " 4. Order a Pet \n"
						+ " 5. Check order status by Order Id"
						+ " 6. Update order status (Admin only functionality)"
						+ " 7. Exit");
				
				try {
					switch(sc.nextInt()) {
					
					case 0: 
						System.out.println("enter username");
						String user = sc.next();
						System.out.println("enter password");
						String pass = sc.next();
						
						if(user.equals(adminLoginId))
						{
						    
							if(pass.equals(adminPassword)) {
								adminFlag = true;
								System.out.println("login successful");
							}else {
								System.out.println("wrong password");
							}
							
						}else if(user.equals(customerLoginId))  {
							
							if(pass.equals(customerPassword)) {
								customerFlag = true;
								System.out.println("login successful");
							}else {
								System.out.println("wrong password");
							}
						}else {
							System.out.println("wrong username or id ");
						}
						break;
					case 1: 
						if(adminFlag ) {
						System.out.println("enter id,name,category,unit price,stocks");
//						Pet pc1 = new Pet(CategoryEnum.DOG.getpetId(),"jack",CategoryEnum.DOG, 1_000,70);
						
						System.out.println("enter name of pet " );
						String pname = sc.next();
						
						System.out.println(" enter the category dog,cat,fish,rabbit");
						CategoryEnum category = CategoryEnum.valueOf(sc.next().toUpperCase());
						
						int id = category.getpetId();
						
						System.out.println("enter price ");
						int price = sc.nextInt();
						
						System.out.println("enter stocks ");
						int stocks = sc.nextInt();
						
						Pet pc1 = new Pet(id,pname,category,price,stocks);
						System.out.println("pet added Succefully");
						}else {
							System.out.println("login first");
						}
						break;
					
					case 2: 
						
						if(adminFlag) {
							System.out.println("enter pet name you want to update ");
							String name = sc.next();
							
							Pet pc2 = new Pet(name);
							if(petDB.contains(pc2)) {
								int index = petDB.indexOf(pc2);
								System.out.println("enter the updated price");
								int price = sc.nextInt();
								petDB.get(index).setUnitPrice(price);
								System.out.println("update succefully");
							}
							}else {
							System.out.println("login as admin");
						}
						break;
					case 3: 
						petDB.forEach(pet-> System.out.println(pet));
						break;
						
					case 4: 
						// order a pet 
						System.out.println("enter the category of pet");
						CategoryEnum c4 = CategoryEnum.valueOf(sc.next().toUpperCase());
						 int id4 = c4.getpetId();
						 System.out.println("enter the quantity ");
						 int quantity = sc.nextInt();
						Order o4 = new Order( id4 , quantity );
						ordersDB.add(o4);
						System.out.println("order placed succefully");
						break;
					case 7: 
						exit = true;
						break;
					case 8: 
						ordersDB.forEach(o->System.out.println(o));
					}
				}catch(Exception e) {
					sc.nextLine();
					System.out.println("error " + e);
				}
			}
		}
	}
}
