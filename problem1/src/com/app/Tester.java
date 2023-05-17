package com.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<BankAccount> bankDB = new ArrayList<>();
		// read file
		// use text in file
		// create class
		// put it in arraylist

		try (Scanner sc = new Scanner(System.in);
				FileReader fr = new FileReader("L:/jan2023.txt");
				BufferedReader br = new BufferedReader(fr);) {

			double sumOfDeposit = 0;
			double maxDeposit = Double.MIN_VALUE;
			double shoppingExpense = 0;
			LocalDate date;

			 br.readLine();

//			System.out.println(len);
//			TransactionDate,Narration,WithdrawalAmount,DepositAmount
//			1-01-2023,Salary Credit,0.0,50000.0

			br.lines().forEach(line -> {

				System.out.println(line);
				String oneLine = line;
				String arr[] = oneLine.split(",");

//				  of​(int year, int month, int dayOfMonth)
				String dateString = arr[0];

				int day = Integer.parseInt(dateString.substring(0, 2));
				int month = Integer.parseInt(dateString.substring(3, 5));
				int year = Integer.parseInt(dateString.substring(6));

				BankAccount b1 = new BankAccount(LocalDate.of(year, month, day), arr[1], Double.parseDouble(arr[2]),
						Double.parseDouble(arr[3]));
				bankDB.add(b1);
			});

//			System.out.println("eoc");

			boolean exit = false;

			while (!exit) {

				System.out.println("1.Sum of all deposits" + " 2.Max deposit amount" + " 3.Shopping expenses"
						+ " 4.Date on which max amount withdrawn " + "5. exit");
				switch (sc.nextInt()) {

				case 1:
					double sum = 0;
					for (BankAccount b : bankDB) {
						sum += b.getDepositAmount();
					}
					
					bankDB.removeIf(a-> {
						return a.getDepositAmount()<10000;
					});
					
					System.out.println(" Sum of all deposits " + sum);

					break;
				case 2:
					double maxNum = Double.MIN_VALUE;
					for (BankAccount b : bankDB) {
						maxNum = Math.max(b.getDepositAmount(), maxNum);
					}
					System.out.println(" Max deposit amount " + maxNum);
					break;
				case 3:
					double expense = 0;
					for (BankAccount b : bankDB) {
						if (b.getNarration().toLowerCase().equals("shopping")) {
							expense += b.getWithdrawalAmount();
						}
					}
					System.out.println("Shopping expenses " + expense);
					break;

				case 4:

					LocalDate ansDate = LocalDate.now();
					double maxDep = Double.MIN_VALUE;
					for (BankAccount b : bankDB) {

						if (b.getWithdrawalAmount() > maxDep) {
							maxDep = b.getWithdrawalAmount();
							ansDate = b.getTransactionDate();
						}
					}
					System.out.println("Date on which max amount withdrawn " + ansDate);
					break;
					
				case -1: 
					bankDB.forEach(a->System.out.println(a));
					break;
				case 5:
					exit = true;
					break;
				}

			}

		} catch (Exception e) {
			System.out.println("error " + e);
		}

	}

}
