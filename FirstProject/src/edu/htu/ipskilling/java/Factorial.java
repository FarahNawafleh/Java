package edu.htu.ipskilling.java;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please a number\n");
		int num = sc.nextInt();
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println(num + " factorial =" + fact);
	}
}
