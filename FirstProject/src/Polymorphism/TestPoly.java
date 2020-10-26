package Polymorphism;

public class TestPoly {
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
		
		B b1 = new B();
		b1.m1();
		
		A a2 = b1;
		a2.m0();
		
		
		
		B b2 = (B)a1; 
		b2.m1();
		
		
		B b3= b1;
		b3.m0();
		
	}

}
