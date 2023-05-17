package utils;

import java.time.LocalDate;
import java.util.ArrayList;

import com.app.core.InkColor;
import com.app.core.Pen;

public class PopulateData {

	public static ArrayList<Pen> populatePenDB() {
		ArrayList<Pen> list = new ArrayList<>();
		
		
//		String brand, String color, InkColor inkColor, String material, int stock,
//		LocalDate stockListingDate, LocalDate stockUpdateDate, double price, double discounts)
		
		list.add(new Pen("lexi","red",InkColor.RED,"plastic",50,LocalDate.parse("2023-01-10"),LocalDate.parse("2023-01-10"),10,0));
		list.add(new Pen("cello","blue",InkColor.BLACK,"metal",150,LocalDate.parse("2023-02-15"),LocalDate.parse("2023-03-10"),25,10));
		list.add(new Pen("parker","green",InkColor.BLUE,"alloy steel",100,LocalDate.parse("2022-01-20"),LocalDate.parse("2022-01-20"),15,0));
		list.add(new Pen("cello","black",InkColor.RED,"metal",200,LocalDate.parse("2022-03-25"),LocalDate.parse("2022-12-10"),20,30));
		list.add(new Pen("reynolds","orange",InkColor.BLUE,"plastic",350,LocalDate.parse("2022-02-12"),LocalDate.parse("2023-03-10"),10,0));

		
		return list;
	}
}
