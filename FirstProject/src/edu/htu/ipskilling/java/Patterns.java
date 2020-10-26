package edu.htu.ipskilling.java;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {

		// This program prints a stars patter

		System.out.print("Welcome to star patterns \nPlease Enter a number. \n");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		System.out.print("\n horizontally: \n");
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}

		System.out.print("\n\n vertically: \n");
		for (int i = 0; i < n; i++) {
			System.out.print("*\n");
		}

		System.out.print("\n square: \n");
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.print(" Left Down corner: \n");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.print(" Right up corner: \n");
		for (int i = n; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		System.out.print(" Left to Right diagonal: \n");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i == j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.print(" Right to Left diagonal: \n");

		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				if (i + j == n + 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		System.exit(0);

	}

}
