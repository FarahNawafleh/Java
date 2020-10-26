package OOP;

public class CircleTest {
public static void main(String[] args) {
	Circle c1 = new Circle();
	Circle c2 = new Circle(3.5);
	Circle c3 = new Circle(-8.0);
	Circle c4 = new Circle(0.0);
	System.out.println("Circle 1 raduis = " + c1.getRaduis());
	
	System.out.println("First circle round = "+ c1.calculateRound());
	System.out.println("First circle area = "+ c1.calculateArea());
	
	System.out.println("second circle round = "+ c2.calculateRound());
	System.out.println("second circle area = "+ c2.calculateArea());
	
	System.out.println("third circle round = "+ c3.calculateRound());
	System.out.println("third circle area = "+ c3.calculateArea());
	
	System.out.println("set circle 4 raduis = 15");
	c4.setRaduis(15);

	System.out.println("fourth circle round = "+ c4.calculateRound());
	System.out.println("fourth circle area = "+ c4.calculateArea());
	
}
}
