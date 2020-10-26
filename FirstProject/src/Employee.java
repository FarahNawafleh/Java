
public class Employee {
	private int id;
	private String name;
	private double salary;
	private Department department;
	private double deduction;
	private double allwonces;

	public double calculateBasicSalary(double s, double d, double a) {
		return s + a - d;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public double getDeduction() {
		return deduction;
	}

	public void setDeduction(double deduction) {
		this.deduction = deduction;
	}

	public double getAllwonces() {
		return allwonces;
	}

	public void setAllwonces(double allwonces) {
		this.allwonces = allwonces;
	}

}
