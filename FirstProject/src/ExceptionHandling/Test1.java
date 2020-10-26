package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("ArithmeticException"); // no need to use exception 
//		try {
			int a = 0;
			int b = 5;
			if (a!=0) {
			System.out.println(b / a);} 
			else System.out.println("Can't divide a number by 0");
//		} catch (ArithmeticException e) {
//			System.out.println("Can't divide a number by 0");
//		}
			
			
		System.out.println("---------------");
		System.out.println("NullPointerException");
		try {
			String farah = "Farah";
			System.out.println(farah.charAt(6));
		} catch (NullPointerException e) {
			System.out.println("NullPointerException..");
		}

		
		System.out.println("---------------");
		System.out.println("FileNotFound Exception");
		try {
			D d = new D();
			d.m1();
			System.out.println("file read succ.");
		} catch (IOException e) {
			System.out.println("error reading file");
			e.fillInStackTrace();
		}

	}

}
