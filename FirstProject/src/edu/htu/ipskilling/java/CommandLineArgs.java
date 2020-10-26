package edu.htu.ipskilling.java;

public class CommandLineArgs {
	public static void main(String[] args) {

		System.out.println("Please Enter 5 number :");
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);

		int sum = Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2])
				+ Integer.parseInt(args[3]) + Integer.parseInt(args[4]);
		System.out.println("Avg =" + (sum / 5));

	}
}