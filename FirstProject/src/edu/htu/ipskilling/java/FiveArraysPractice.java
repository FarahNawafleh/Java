package edu.htu.ipskilling.java;

import java.util.concurrent.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FiveArraysPractice {
	public static void main(String[] args) {
		long start = System.nanoTime();
		Scanner sc = new Scanner(System.in);
		// Size of the array
		System.out.print("Please enter size of the array : ");
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		int[] arr4 = new int[n];
		int[] arr5 = new int[n];
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		int sum5 = 0;

		Random rand = new Random();

		// initialize arrays
		for (int i = 0; i < n; i++) {
			arr1[i] = rand.nextInt(100);
			arr2[i] = rand.nextInt(100);
			arr3[i] = rand.nextInt(100);
			arr4[i] = rand.nextInt(100);
			arr5[i] = rand.nextInt(100);
		}
		System.out.println("Elements of the arrays ... ");
		// Printing arrays values
		for (int i = 0; i < n; i++) {
			System.out.println("Array 1 ... Element " + (i + 1) + "=" + arr1[i]);
			System.out.println("Array 2 ... Element " + (i + 1) + "=" + arr2[i]);
			System.out.println("Array 3 ... Element " + (i + 1) + "=" + arr3[i]);
			System.out.println("Array 4 ... Element " + (i + 1) + "=" + arr4[i]);
			System.out.println("Array 5 ... Element " + (i + 1) + "=" + arr5[i]);
			sum1 += arr1[i];
			sum2 += arr2[i];
			sum3 += arr3[i];
			sum4 += arr4[i];
			sum5 += arr5[i];
		}

		int avg1 = sum1 / n;
		int avg2 = sum2 / n;
		int avg3 = sum3 / n;
		int avg4 = sum4 / n;
		int avg5 = sum5 / n;

		System.out.println("\nSorting Arrays ...");
		// Sorting arrays
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		Arrays.sort(arr4);
		Arrays.sort(arr5);

		for (int i = 0; i < n; i++) {
			System.out.println("Array 1 ... Index " + (i + 1) + " value = " + arr1[i]);

		}
		for (int i = 0; i < n; i++) {
			System.out.println("Array 2 ... Index " + (i + 1) + "value = " + arr2[i]);
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Array 3 ... Index " + (i + 1) + " value = " + arr3[i]);
		}
		for (int i = 0; i < n; i++) {
			System.out.println("Array 4 ... Index " + (i + 1) + " value = " + arr4[i]);
		}
		for (int i = 0; i < n; i++) {

			System.out.println("Array 5 ... Index " + (i + 1) + " value = " + arr5[i]);
		}

		// printing the average
		System.out.println("\nArray1 Avg = " + avg1);
		System.out.println("Array2 Avg = " + avg2);
		System.out.println("Array3 Avg = " + avg3);
		System.out.println("Array4 Avg = " + avg4);
		System.out.println("Array5 Avg = " + avg5);

		// counting duration
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("Duration : " + TimeUnit.SECONDS.convert(duration, TimeUnit.NANOSECONDS) + "second.");

	}
}
