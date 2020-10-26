package edu.htu.ipskilling.java;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class Practice {
public static void main(String[] args) {
	System.out.println("Hello from Farah");
	
	String name=JOptionPane.showInputDialog("Welcome \n Please enter your name.");
	

	JOptionPane.showMessageDialog(null, "Welcome "+name);

Scanner sc = new Scanner(System.in);
System.out.print("Please enter a value ");
int value = sc.nextInt();
System.out.print("your value multiplied by 2 =" + value*2);
System.exit(0);

}
}
