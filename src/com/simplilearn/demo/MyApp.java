package com.simplilearn.demo;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to CashBack App");
		int[] cashBack = { 20, 200, 120, 500, 60, 80 };
		int luckyNumber = 0;

		try {
			System.out.println("Enter any number");
			luckyNumber = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println("For your lucky number " + luckyNumber + " CashBack Earned is " + cashBack[luckyNumber]);

		sc.close();
		System.out.println("Thankyou for  Playing Lucky Number Cashback");
	}

}
