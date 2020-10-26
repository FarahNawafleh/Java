package OOP;

public class Person {
	// Create Employee class with instance variables : id, name, basicSalary,
	// allowances and deduction
	// as instance variables and getFinalSalary as an action
	private String name;
	private int id;
	private int basicSalary;
	private int deduction;
	private int allowances;

	public Person() {
	this.name = "Farah";
	this.id = 2;
	this.basicSalary = 500;
	this.deduction = 50;
	this.allowances = 30;
	}
	public Person(String name, int id,int basicSalary, int deduction, int allowances) {
		this.name = name;
		this.id = id;
		this.basicSalary = basicSalary;
		this.deduction = deduction;
		this.allowances = allowances;
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getDeduction() {
		return deduction;
	}

	public void setDeduction(int deduction) {
		this.deduction = deduction;
	}

	public int getAllowances() {
		return allowances;
	}

	public void setAllowances(int allowances) {
		this.allowances = allowances;
	}

	public  void SayHello(String name, int id) {
		System.out.println("Hello " + name + "  " + id);

	}

	public  int calculateFinalSalary(int basicSalary, int deduction, int allowances) {
		System.out.print("The Final salary = ");
		return (basicSalary + allowances - deduction);

	}

}
