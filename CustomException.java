package com.abc.exception;

import java.util.Scanner;

public class CustomException extends Exception {
	static int age;

	public void calAge() {

		if (age < 18) {
			System.out.println("Sorry u are not able to do vote, ur Age is not completed 18");
		} else {
			System.out.println("U are able to do vote, thank u for voting");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CustomException c1 = new CustomException();

		try {

			System.out.println("Enter a age: ");
			age = sc.nextInt();
			throw new CustomException();
		}

		catch (CustomException e) {
			c1.calAge();

		}

		finally {
			System.out.println("Program Ends Here.......");
		}
	}

}
