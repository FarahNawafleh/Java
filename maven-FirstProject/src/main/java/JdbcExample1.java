import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jk.util.JK;

public class JdbcExample1 {
	public static void main(String[] args) {
		System.out.println("Hello Maven");
		JK.printBlock("Printing Hello in a block");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first-project", "root", "123456");
			System.out.println("Deleting All records from Employee table ...");
			PreparedStatement del = con.prepareStatement("DELETE FROM employee"); // without where statements to delete
																				// all records
			del.execute();
			System.out.println("Deleted !");
//------------------------------------
			System.out.println("Inserting data ... ");

			PreparedStatement ins = con.prepareStatement("INSERT INTO employee VALUES (?,?,?,?)");
			ins.setInt(1, 1);
			ins.setString(2, "Rahaf");
			ins.setInt(3, 700);
			ins.setInt(4, 2);
			ins.execute();
			System.out.println("Record 1 added success !");

			ins.setInt(1, 2);
			ins.setString(2, "Farah");
			ins.setInt(3, 100);
			ins.setInt(4, 1);
			ins.execute();
			System.out.println("Record 2 added success !");

			ins.setInt(1, 3);
			ins.setString(2, "Majd");
			ins.setInt(3, 400);
			ins.setInt(4, 3);
			ins.execute();
			System.out.println("Record 3 added success !");

			ins.setInt(1, 4);
			ins.setString(2, "Shahed");
			ins.setInt(3, 600);
			ins.setInt(4, 2);
			ins.execute();
			System.out.println("Record 4 added success !");
			
// ------------------------------------
			System.out.println("Updating record ... ");

			PreparedStatement up = con.prepareStatement("UPDATE employee SET salary=? WHERE emp_id=?");
			up.setInt(1, 1);
			up.setInt(2, 500);
			up.execute();
			System.out.println("updated succecc !");
			
// ------------------------------------
			System.out.println("Printing elements ...");
			PreparedStatement sel = con.prepareStatement("SELECT * FROM employee");
			ResultSet rs = sel.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("emp_id");
				String name = rs.getString("emp_name");
				int salary = rs.getInt("salary");
				int degree = rs.getInt("degree_id");
				JK.printBlock(id, name, salary, degree);
			}
			sel.close();
			rs.close();
			con.close();
			ins.close();
			up.close();
			del.close();
			System.out.println("Done");

//		SELECT emp_id, emp_name, salary, degree_id
//		FROM employee;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
