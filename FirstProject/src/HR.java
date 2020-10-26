import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class HR {
	static String fileName = "C:\\Users\\Farah\\Desktop\\Upskilling\\Cohort5_Java_FarahNawafleh\\FirstProject\\src\\employees.csv";

	public static void main(String[] args) {
		System.out.println(
				"==================\n1)Add Employee\n2)Find Employee\n3)Delete Employee\n4)Update Employee\n5)Show all Employees\n6)Exit\n==================\nPlease choose 1-6\n===================");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();

		switch (op) {
		case 1:
			System.out.println("Add Employee :");
			addEmployee(fileName);
			main(null);
			break;

		case 2:
			System.out.println("Find Employee :");
			findEmployee(fileName);
			main(null);

			break;
		case 3:
			deleteEmployee(fileName);
			System.out.println("");
			main(null);

			break;
		case 4:
			// update means delete and add
			System.out.println("Update Employee (You can only change the Basic salary, Deduction, and allowances):");
			updateEmployee(fileName);
			main(null);

			break;
		case 5:
			showEmployees(fileName);
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

	public static void showEmployees(String fileName) {

		String employeesData = readFile(fileName);
		String employees[] = employeesData.split("\\r?\\n");
		for (int i = 0; i < employees.length; i++) {
			String employee = employees[i];
			System.out.println("            	ID-Name-Deduction-Allwances");
			System.out.println("Employee Info: \t" + employee);

			for (int j = 0; j < employees.length; j++) {
				String[] this_employee = employee.split(",");

				if (j == 0) {
					System.out.println("Final Salary = \t" + (Integer.parseInt(this_employee[2])
							+ Integer.parseInt(this_employee[3]) - Integer.parseInt(this_employee[4])));
				}
			}
		}
	}

	public static void updateEmployee(String fileName) {

		String[] employees = split(fileName);
		System.out.println("Please Enter Employee ID ");
		System.out.println("-------------------------");
		Scanner sc = new Scanner(System.in);
		int emp_id = sc.nextInt();
		System.out.println("Please Enter New salary :");
		int basic = sc.nextInt();
		System.out.println("Please Enter New Deduction :");
		int deduction = sc.nextInt();
		System.out.println("Please Enter New Allwances :");
		int allowances = sc.nextInt();
		String f_emp = "";
		boolean flag = false;
		for (int i = 0; i < employees.length; i++) {
			String employee = employees[i];
			String[] this_employee = employee.split(",");
			int id = Integer.parseInt(this_employee[0]);
			if (emp_id == id) {
				employee = (id + "," + this_employee[1] + "," + basic + "," + deduction + "," + allowances);
			}
			f_emp += employee + "\n";
		}
		writeToFile(fileName, f_emp, true);
	}

	public static void deleteEmployee(String fileName) {
		String[] employees = split(fileName);
		System.out.println("Please Enter Employee ID ");
		Scanner sc = new Scanner(System.in);
		int emp_id = sc.nextInt();

		String em = "";

		for (int i = 0; i < employees.length; i++) {
			String employee = employees[i];
			String[] this_employee = employee.split(",");
			int id = Integer.parseInt(this_employee[0]);

			if (emp_id == id) {
				employees[i] = "";
			}
			em += employees[i] + "\n";
		}

		writeToFile(fileName, em, true);
	}

	public static void addEmployee(String fileName) {
		System.out.println("Please Enter Employee :\n ID:");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		System.out.println("Name :");
		String name = sc.next();
		System.out.println("Basic :");
		int basic = sc.nextInt();
		System.out.println("Deduction :");
		int deduction = sc.nextInt();
		System.out.println("allwances :");
		int allwances = sc.nextInt();

		writeToFile(fileName, "\n" + id + "," + name + "," + basic + "," + deduction + "," + allwances);
		System.out.println("Added Successfully");
	}

	public static void findEmployee(String fileName) {
		String[] employees = split(fileName);
		System.out.println("Please Enter Employee ID ");
		Scanner sc = new Scanner(System.in);
		int emp_id = sc.nextInt();

		for (int i = 0; i < employees.length; i++) {
			String employee = employees[i];
			String[] this_employee = employee.split(",");
			int id = Integer.parseInt(this_employee[0]);
			String name = this_employee[1];
			String basic = this_employee[2];
			String deduction = this_employee[3];
			String allowances = this_employee[4];
			if (emp_id == id) {
				System.out.println("\n\nEmployee with id = " + emp_id + "  Found :\n");
				System.out.println("Employee " + (i + 1) + "  name :" + name + "\n\tid :" + id + "\n\tBasic Salary :"
						+ basic + "\n\tDeduction:" + deduction + "\n\tAllowances :" + allowances);
			} else
				continue;
		}

	}

	public static String[] split(String fileName) {
		String employeesData = readFile(fileName);
		String employees[] = employeesData.split("\\r?\\n");
		for (int i = 0; i < employees.length; i++) {
			String employee = employees[i];
			System.out.println("            	ID-Name-Deduction-Allwances");

			System.out.println("Employee Info: \t" + employee);

		}
		return employees;
	}

	public static void writeToFile(String fileName, String msg) {
		try {

			// writing without overwriting
			PrintWriter out = new PrintWriter(new FileWriter(fileName, true));
			out.append(msg);
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeToFile(String fileName, String msg, boolean flag) {
		// the flag to overwrite
		try {

			// writing without overwriting
			PrintWriter out = new PrintWriter(new FileWriter(fileName));
			out.append(msg);
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readFile(String fileName) {

		try {
			FileReader file = new FileReader(fileName);
			String text = "";
			int c;
			while ((c = file.read()) != -1) {
				text += (char) c;
			}
			file.close();
			return (text);

		} catch (Exception e) {
			System.out.println("Error");
			e.printStackTrace();
			return null;
		}

	}
}