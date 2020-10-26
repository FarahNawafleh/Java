
public class A {
	C c;
	

	public A() {
		
	}


	public void setC(C c) {
		this.c = c;
	}


	public void test() {
		B b = new B();
		b.m2();
		c.m1();

	}

}
