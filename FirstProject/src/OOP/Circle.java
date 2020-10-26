package OOP;

public class Circle {
	private  double raduis;
	public static final double PI = 22/7;

	public  Circle(double raduis) {
		setRaduis(raduis);
	}

	public Circle() {
		setRaduis(10);
	}

	public  double getRaduis() {
		return raduis;
	}

	public  void setRaduis(double raduis) {
		if (raduis >= 0)
			this.raduis = raduis;
		else
			raduis = 0;
	}

	public  double calculateRound() {
		return 2 * PI * raduis;
	}

	public  double calculateArea() {
		return PI * raduis * raduis;
	}

}
