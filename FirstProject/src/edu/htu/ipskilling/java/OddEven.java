package edu.htu.ipskilling.java;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		// write a program to check if the number is entered by the user is odd or even
		// if it is odd print "odd" else print "even"

		Scanner sc = new Scanner(System.in);
		System.out.println("Please a number\n");
		int num = sc.nextInt();
		String msg = (num % 2 == 0) ? "The number is Even" : "The number is Odd";
		System.out.println(msg);

	}
}
