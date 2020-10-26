package edu.htu.ipskilling.java;

public class Primitives {
	public static void main(String[] args) {
		// Here, Trying to convert between primitives 
		///
		int i1 = 10;
		double i2 = 10.0;
		float i3 = 10.0f;
		long i4 = 10;
		char i5 = 'a';
		byte i6 = 10;
		i1 = (int) i2;
		System.out.println(i1);
		i2 = (double) i3;
		System.out.println(i2);
		i1 = (int) i5;
		System.out.println(i1);
		i1 = (int) i6;
		System.out.println(i1);

	}
}
