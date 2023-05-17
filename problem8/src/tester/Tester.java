package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.app.core.InkColor;
import com.app.core.Pen;

import utils.PopulateData;

public class Tester {

	public static void main(String[] args) {

		ArrayList<Pen> penDB = PopulateData.populatePenDB();

		boolean exit = false;
		try (Scanner sc = new Scanner(System.in)) {
			while (!exit) {
				System.out.println("1.add pen " + " 2. update stock of pen \n"
						+ " 3. 20% discounts which are not sold in last 3 months \n"
						+ " 4. remove pen which are not sold in 9 months");

				try {
					switch (sc.nextInt()) {
                    
					case 1: 
//						
						System.out.println("brand name");
						String brand = sc.next();
						
						System.out.println("color ");
						String color = sc.next();
						
						System.out.println("Ink COlor");
						InkColor inkColor = InkColor.valueOf(sc.next().toUpperCase());
						
						System.out.println("material name");
						String material = sc.nextLine();
						sc.nextLine();
						
						System.out.println("number of stocks");
						int stocks  = sc.nextInt();
						
						System.out.println("enter stock listing date");
						LocalDate stockListingDate = LocalDate.parse(sc.next());
						
						System.out.println("enter stock update date");
						LocalDate stockUpdateDate = LocalDate.parse(sc.next());
						
						System.out.println("enter price");
						Double price = sc.nextDouble();
						
						System.out.println("enter discount");
						Double discount = sc.nextDouble();

						
						Pen p1 = new Pen(brand,color,inkColor,material,stocks,stockListingDate,stockUpdateDate,price,discount);
						break;
					case 2: 
						System.out.println("enter id of the pen");
						int id = sc.nextInt();
						Pen p2 = new Pen(id);
						
						if(penDB.contains(p2)) {
							System.out.println("enter the amount of stock");
							int stock = sc.nextInt();
							int index = penDB.indexOf(p2);
							
							penDB.get(index).setStock(stock);
							penDB.get(index).setStockUpdateDate(LocalDate.now());
							System.out.println("Update succefully ");
						}else {
							System.out.println("wrong id ");
						}
						break;
					case 3:
						for (Pen p : penDB) {

							if (p.getStockUpdateDate().isBefore(LocalDate.now().minusMonths(3))) {
								p.setDiscounts(20);
							}
						}
						break;
//					case 4:
//						Iterator<Pen> it = penDB.iterator();
//						while(it.hasNext()) {
//							
//							Pen p = it.next();
//							if(p.getStockUpdateDate().minusMonths(9).isBefore(p.getStockListingDate()) || 
//							p.getStockUpdateDate().minusMonths(9).isEqual(p.getStockListingDate())) {
//								
//							}
//						}
//						break;
						
					case 5:
						penDB.forEach(p -> System.out.println(p));
						break;
					case 6:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
