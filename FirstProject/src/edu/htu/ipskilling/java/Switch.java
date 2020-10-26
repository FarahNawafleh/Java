package edu.htu.ipskilling.java;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int a, b, op;

		System.out.println("Please Enter 2 numbers : ");
		a = Sc.nextInt();
		b = Sc.nextInt();
		System.out.println("1, 5, 8  For addition - 2, 7, For subtraction");
		System.out.println("please enter your choise ");
		op = Sc.nextInt();
		switch (op) {
		case 1:
		case 5:
		case 8:
			System.out.println(a + b);
			break;
		case 2:
		case 7:
			System.out.println("a-b");
			break;
		}
	}
}
