package edu.htu.ipskilling.java;

public class Methods {
	public static void main(String[] args) {
		double num1 = 2.5;
		double num2 = 5.2;
		display(num1, num2);
	}

	public static double calculateSum(double num1, double num2) {
		
		return num1 + num2;
	}

	public static double calculateAvg(double num1, double num2) {
		System.out.print("\nThe Average = ");
		return (calculateSum(num1, num2) / 2);
	}

	public static void display(double num1, double num2) {

		System.out.println("The summation = "+calculateSum(num1, num2));
		System.out.println(calculateAvg(num1, num2));
	}
}
