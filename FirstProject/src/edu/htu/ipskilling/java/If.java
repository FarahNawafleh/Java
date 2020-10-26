package edu.htu.ipskilling.java;

public class If {
	public static void main(String[] args) {
		int a =10;
		int b = 5;
		if(a>b) {
			System.out.println("A is greater than A");
		}
		else if(a<b) {
			System.out.print("A is less than B");
		}
		else if(a==b) {
			System.out.print("A equals B");
		}
		else if(a == 9 && b==0)
			System.out.print("a = 9 \nb=0");
	}

}
