package edu.htu.ipskilling.java;

import java.util.Arrays;
import java.util.Scanner;

public class MaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];

		System.out.println("Please enter 5 numbers ");
		for (int i = 0; i < 5; i++) {
			nums[i] = sc.nextInt();
		}
		Arrays.sort(nums);
		System.out.println("the max value = " + nums[4]);
	}
}
