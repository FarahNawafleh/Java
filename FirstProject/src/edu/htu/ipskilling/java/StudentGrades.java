package edu.htu.ipskilling.java;

import java.util.Scanner;

public class StudentGrades {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your name ");
		// Student name
		String name = sc.nextLine();
		// Number of subjects
		System.out.println("Please enter number of subjects ");
		int num = sc.nextInt();
		double[] grades = new double[num];
		double sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.println("Please enter the grade of subject" + (i + 1));
			grades[i] = sc.nextDouble();
			sum += grades[i];

		}
		double gpa = sum / num;
		System.out.println(name + "Your GPA =" + gpa);

	}

}
