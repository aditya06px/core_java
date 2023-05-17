package com.app.utils;

import java.util.ArrayList;

import com.app.pet.CategoryEnum;
import com.app.pet.Order;
import com.app.pet.Pet;
import com.app.pet.StatusEnum;

public class UtilityClass {

	public static ArrayList<Pet> populatePetDB() {
//		Pet ( petId, name, category, unitPrice, stocks)
		ArrayList<Pet> petList = new ArrayList<>();
	
//		petId = 101, name=” Bull Dog”, category= DOG, unitPrice= 1000, stocks=50
		
		Pet p1 = new Pet(CategoryEnum.DOG.getpetId(),"jack",CategoryEnum.DOG, 1_000,70);
		petList.add(p1);
		
		p1 = new Pet(CategoryEnum.CAT.getpetId(),"cash",CategoryEnum.CAT, 500,100);
		petList.add(p1);
		
		p1 = new Pet(CategoryEnum.FISH.getpetId(),"dan",CategoryEnum.FISH, 700,85);
		petList.add(p1);
		
		p1 = new Pet(CategoryEnum.RABBIT.getpetId(),"jan",CategoryEnum.RABBIT, 300,35);
		petList.add(p1);
		
		return petList;
	}  
	
	public static ArrayList<Order> populateOrderDB() {
		ArrayList<Order> orderList = new ArrayList<>();
//		Order (orderId, petId, quantity, status)
//		orderId=1, petId=101, quantity=5, status=PLACED
            Order o1 = new Order(101,100);
            orderList.add(o1);
            
            o1 = new Order(201,30);
            orderList.add(o1);
            
            o1 = new Order(301,30);
            orderList.add(o1);
            
            o1 = new Order(001,500);
            orderList.add(o1);
            
		return  orderList;
	}
}