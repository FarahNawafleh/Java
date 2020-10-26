import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HRSystem {
	private int id;
	private String name;
	private int basic;
	private int deduction;
	private int allwances;
	private String fileName;

	public HRSystem() {
		setFileName(
				"C:\\Users\\Farah\\Desktop\\Upskilling\\Cohort5_Java_FarahNawafleh\\FirstProject\\src\\employees.csv");
		setBasic(400);
		setAllwances(40);
		setDeduction(20);
		setId(108);
		setName("Rawan");
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBasic(int basic) {
		if (basic >= 100)
			this.basic = basic;
		else {
			System.out.println("Basic Salary should be more than 100 JOD, Setting default value 100 !");
			basic = 100;
		}
	}

	public void setAllwances(int allwances) {
		if (allwances >= 0)
			this.allwances = allwances;
		else {
			System.out.println("Allwances should be more than 0 JOD, Setting default value 0  !");
			allwances = 0;
		}
	}

	public int getBasic() {
		return basic;
	}

	public String getName() {
		return name;
	}

	public int getDeduction() {
		return deduction;
	}

	public void setDeduction(int deduction) {
		if (deduction >= 0)
			this.deduction = deduction;
		else {
			System.out.println("Deduction should be more than 0 JOD, Setting default value 0 !");
			deduction = 0;
		}
	}

	public int getAllwances() {
		return allwances;
	}

	public void updateEmployee() {

		String[] employees = split();
		System.out.println("Please Enter Employee ID ");
		System.out.println("-------------------------");
		Scanner sc = new Scanner(System.in);
		setId(sc.nextInt());
		System.out.println("Please Enter New salary :");
		setBasic(sc.nextInt());
		System.out.println("Please Enter New Deduction :");
		setDeduction(sc.nextInt());
		System.out.println("Please Enter New Allwances :");
		setAllwances(sc.nextInt());
		String f_emp = ""; // f indicates final result
		for (int i = 0; i < employees.length; i++) {
			String employee = employees[i];
			String[] this_employee = employee.split(",");
			int emp_id = Integer.parseInt(this_employee[0]);
			if (emp_id == getId()) {
				employee = (getId() + "," + this_employee[1] + "," + getBasic() + "," + getDeduction() + ","
						+ getAllwances());
				f_emp += employee;
				continue;
			}
			//this if statement to avoid adding new line at the end that makes error while using method split !
			if (i == employees.length - 1) {
				f_emp += employee;
				break;
			}
		
			f_emp += employee + "\n";
		}
		System.out.println("Updated Successfully");

		writeToFile(f_emp, true);
	}

	public void deleteEmployee() {
		String[] employees = split();
		System.out.println("Please Enter Employee ID ");
		Scanner sc = new Scanner(System.in);
		setId(sc.nextInt());

		String em = "";

		for (int i = 0; i < employees.length; i++) {
			String employee = employees[i];
			String[] this_employee = employee.split(",");
			int emp_id = Integer.parseInt(this_employee[0]);

			if (emp_id == getId()) {
				continue; 
			}

			if (i == employees.length - 1) {
				em += employees[i];
				break;
			}
			em += employees[i] + "\n";

		}
		System.out.println("Deleted Successfully");

// The flag indicates to call the method that overwrites on the file 
		writeToFile(em, true);
	}

	public void addEmployee() {
		System.out.println("Please Enter Employee :\n ID:");
		Scanner sc = new Scanner(System.in);
		setId(sc.nextInt());
		System.out.println("Name :");
		setName(sc.next());
		System.out.println("Please enter positive values !");
		System.out.println("Basic :");
		setBasic((sc.nextInt()));
		System.out.println("Deduction :");
		setDeduction((sc.nextInt()));
		System.out.println("allwances :");
		setAllwances((sc.nextInt()));
		writeToFile("\n" + getId() + "," + getName() + "," + getBasic() + "," + getDeduction() + "," + getAllwances());
		System.out.println("Added Successfully");
	}

	public void findEmployee() {
		String[] employees = split();
		System.out.println("Please Enter Employee ID ");
		Scanner sc = new Scanner(System.in);
		int emp_id = sc.nextInt();

		for (int i = 0; i < employees.length; i++) {
			String employee = employees[i];
			String[] this_employee = employee.split(",");
			setId(Integer.parseInt(this_employee[0]));
			setName(this_employee[1]);
			setBasic(Integer.parseInt(this_employee[2]));
			setDeduction(Integer.parseInt(this_employee[3]));
			setAllwances(Integer.parseInt(this_employee[4]));
			if (emp_id == getId()) {
				System.out.println("\n\nEmployee with id = " + emp_id + "  Found :\n");
				System.out.println(
						"Employee #" + (i + 1) + "  name :" + getName() + "\n\tid :" + getId() + "\n\tBasic Salary :"
								+ getBasic() + "\n\tDeduction:" + getDeduction() + "\n\tAllowances :" + getAllwances());
			} else
				continue;
		}

	}

	public String[] split() {
		String employeesData = readFile();
		String employees[] = employeesData.split("\\r?\\n");
		for (int i = 0; i < employees.length; i++) {
			String employee = employees[i];
			System.out.println("            	ID-Name-Deduction-Allwances");

			System.out.println("Employee Info: \t" + employee);

		}

		return employees;
	}

	public void writeToFile(String msg) {
		try {

			// writing without overwriting
			PrintWriter out = new PrintWriter(new FileWriter(fileName, true));
			out.append(msg);
			out.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeToFile(String msg, boolean flag) {
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

	public String readFile() {

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

	public void showEmployees() {
		String employeesData = readFile();
		String employees[] = employeesData.split("\\r?\\n");
		for (int i = 0; i < employees.length; i++) {
			String employee = employees[i];
			System.out.println("-------------------------");

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

}
