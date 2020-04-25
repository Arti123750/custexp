package com.abc.exception;

import java.util.Scanner;

public class CustomeExceptionForATM extends Exception {

	static int balance = 10000;
	static int wid, total;

	public void calBalance() {
		total = balance - wid;

		if (wid < balance) {
			System.out.println(wid + " Take ur money....");
			System.out.println("ur Reamimg balance is: " + total);
		} else {
			System.out.println("Sorry u have not sufficient balance, please try latter");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// CustomeExceptionForATM a1 = new CustomeExceptionForATM();

		try {
			System.out.println("Enter amount which u wnat to withdraw...");
			wid = sc.nextInt();
			throw new CustomeExceptionForATM();
		} catch (CustomeExceptionForATM e) {
			e.calBalance();
		} finally {
			System.out.println("Thank u Visiting....");
		}

	}

}
