import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class VehicleDao extends GeneralDao {
	public void delete(String vin) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first-project", "root", "123456");
		PreparedStatement ps = con.prepareStatement("DELETE FROM dmv_vehicles WHERE veh_vin_number=?");
		ps.setString(1, vin);
		int count = ps.executeUpdate();
		if (count == 1) {
			System.out.println("Record Deleted");
		} else {
			System.out.println("Record not found");
		}
	}

	public Vector<Vehicle> show() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first-project", "root", "123456");
		PreparedStatement ps = con.prepareStatement("SELECT * FROM dmv_vehicles");
		ResultSet rs = ps.executeQuery();
		System.out.println("Showing All Records ... ");
		System.out.println("--------------------------");
		int counter = 0;
		Vector<Vehicle> list = new Vector<Vehicle>();
		while (rs.next()) {
			counter++;
			Vehicle v = new Vehicle();
			v.setVehBrand(rs.getString("veh_brand"));
			v.setVehModel(rs.getString("veh_model"));
			v.setVehYear(rs.getInt("veh_year"));
			v.setVehVin(rs.getString("veh_vin_number"));
			list.add(v);
		}
		return list;

	}}

//	public void update(Vehicle v) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first-project", "root", "123456");
//			PreparedStatement ps = con.prepareStatement(
//					"UPDATE dmv_vehicles SET veh_brand=?, veh_model=?, veh_year=?  WHERE veh_vin_number=?");
//			ps.setString(1, brand);
//			ps.setString(2, model);
//			ps.setInt(3, year);
//			ps.setString(4, vin);
//			int count = ps.executeUpdate();
//			if (count == 1) {
//				System.out.println("Record Updated ...");
//			} else {
//				System.out.println("Record not fount ...");
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}
//}
