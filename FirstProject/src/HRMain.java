import java.util.Scanner;

public class HRMain {

	public static void main(String[] args) {

		HRSystem employees = new HRSystem();
		
		
			System.out.println(
					"------------------\n1)Add Employee\n2)Find Employee\n3)Delete Employee\n4)Update Employee\n5)Show all Employees\n6)Exit\n##################\nPlease choose 1-6\n------------------");
			Scanner sc = new Scanner(System.in);
			int op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Add Employee :");
				employees.addEmployee();
				main(null);
				break;

			case 2:
				System.out.println("Find Employee :");
				employees.findEmployee();
				main(null);

				break;
			case 3:
				employees.deleteEmployee();
				System.out.println("");
				main(null);

				break;
			case 4:
				// update means delete and add
				System.out.println("Update Employee\n(You can only change the Basic salary, Deduction, and allowances):");
				employees.updateEmployee();
				main(null);

				break;
			case 5:
				employees.showEmployees();
				main(null);

				break;
			case 6:
				System.out.println("Exit ! \nGoodBye");
				break;
			default:
				System.out.println("Invalid !\nTry again");
				main(null);

			}
	}
}