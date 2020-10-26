package edu.htu.ipskilling.java;

import javax.swing.JOptionPane;

public class CommandLineCalc {
public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "Please enter two numbers");
    Double num1, num2;
    num1= Double.parseDouble(JOptionPane.showInputDialog("Number 1 = "));
    num2= Double.parseDouble(JOptionPane.showInputDialog("Number 2 = "));
    
    int operation =Integer.parseInt(JOptionPane.showInputDialog("Menu \n Input 1 to add\n Input 2 to Subtract\n Input 3 to divide\n  Input 4 to multiply"));
   
	switch (operation) 
	{
	case 1:
		JOptionPane.showMessageDialog(null, "The result of Addition = "+ (num1+num2));
		break;
	case 2:
		JOptionPane.showMessageDialog(null, "The result of Subtraction = "+ (num1-num2));
		break;
	case 3:
		JOptionPane.showMessageDialog(null, "The result of Multiplication = "+ (num1/num2));

		break;
	case 4:
		JOptionPane.showMessageDialog(null, "The result of Division = "+ (num1*num2));
		break;
		default:
	    JOptionPane.showMessageDialog(null, "Try again, choose 1-4");

			
	}
}
}
