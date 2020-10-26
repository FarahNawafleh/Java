
public class EmpDeptTest {
public static void main(String[] args) {
	Employee e = new Employee ();
	Department d = new Department();
	e.setName("Farah");
	System.out.println(e.getName());
	System.out.println(e.calculateBasicSalary(750, 0, 10));
	d.setId(1);
	e.setDepartment(d);
}
}
