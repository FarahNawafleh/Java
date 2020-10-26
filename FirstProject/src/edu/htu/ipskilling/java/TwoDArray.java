package edu.htu.ipskilling.java;

import java.util.Random;
import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		Random rand = new Random();

		System.out.println("Please enter the size of the array");
		n = sc.nextInt();
		int[][] arr = new int[n][n];

		// Initialization of the array elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(100);
			}
		}

		// Printing the elements
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("\t" + arr[i][j]);

			}
			System.out.println("");
		}
	}

}
