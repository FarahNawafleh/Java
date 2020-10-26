package edu.htu.ipskilling.java;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PracticeLoopsArrays {
	public static void main(String[] args) {
		long start = System.nanoTime();
		// Size of the array
		int n = 10;
		int[] arr = new int[n];
		Random rand = new Random();

		// initialize array elements
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		System.out.println("Elements of the array ... ");
		// Printing array values
		for (int value : arr) {
			System.out.println(value);
		}

		System.out.println("\nSorting Array ...");
		// Sorting array
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Index " + i + " value = " + arr[i]);
		}

		// counting duration
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("Duration : " + TimeUnit.SECONDS.convert(duration, TimeUnit.NANOSECONDS) + "second.");

	}
}
