package OOP;

public class Person2 {
	public static void main(String[] args) {
		Person employee1 = new Person();
		Person employee2 = new Person("Rahaf",5, 700, 60,40);
		employee1.SayHello(employee1.getName(), employee1.getId());
		System.out.println(employee1.calculateFinalSalary(employee1.getBasicSalary(), employee1.getDeduction(), employee1.getAllowances()));

		employee2.SayHello(employee2.getName(), employee2.getId());

		System.out.println(employee1.calculateFinalSalary(employee2.getBasicSalary(), employee2.getDeduction(), employee2.getAllowances()));

	}
}
