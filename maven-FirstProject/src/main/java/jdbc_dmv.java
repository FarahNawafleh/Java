import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class jdbc_dmv {
	public static void main(String[] args) {

		boolean flag = false;
		while (!flag) {
			showMenu();
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();

			try {
				switch (ch) {
				case 1:
					add();
					break;
				case 2:
					find();
					break;
				case 3:
					update();
					break;
				case 4:
					delete();
					break;
				case 5:
					showAll();
					break;
				case 6:
					flag = true;
					System.out.println("Exiting, Bye!");
					break;
				default:
					System.out.println("Invalid, Try again !");
				}
			 } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		}
	}

	private static void showMenu() {
		System.out.println("--------------------------");
		System.out.println("Menu:");
		System.out.println("1- Add Vehicle");
		System.out.println("2- Find Vehicle");
		System.out.println("3- Update Vehicle");
		System.out.println("4- Delete Vehicle");
		System.out.println("5- Show All Vehicles");
		System.out.println("6- Quit");
		System.out.println("--------------------------");
		System.out.println("Please enter your choice");
	}

	private static void showAll() throws ClassNotFoundException, SQLException {
		VehicleDao dao = new VehicleDao();
			Vector<Vehicle> list = dao.show();
			for (Vehicle vehicle : list) {
				System.out.println(vehicle);
			}
		
	}

	private static void delete() throws ClassNotFoundException, SQLException {
		VehicleDao dao = new VehicleDao();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Vin Number ");
		String vin = sc.next();
		dao.delete(vin);
	}

	private static void update() {
		VehicleDao dao = new VehicleDao();
		Vehicle v = new Vehicle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your vehicle Brand");
		v.setVehBrand(sc.next());
		System.out.println("Please enter your vehicle Model");
		v.setVehModel(sc.next());
		System.out.println("Please enter your vehicle Year");
		v.setVehYear(sc.nextInt());
		System.out.println("Please enter your vehicle VIN Number");
		v.setVehBrand(sc.next());
//		dao.update(vin);
		
	}

	private static void find() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Vin Number ");
		String vin = sc.next();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first-project", "root", "123456");
			PreparedStatement ps = con.prepareStatement("SELECT * FROM dmv_vehicles WHERE veh_vin_number=?");
			ps.setString(1, vin);
			ResultSet rs = ps.executeQuery();
			System.out.println("Record Found ... ");
			System.out.println("--------------------------");
			if (rs.next()) {
				String brand = rs.getString("veh_brand");
				String model = rs.getString("veh_model");
				int year = rs.getInt("veh_year");
				System.out.println(brand + "\t" + model + "\t" + year + "\t" + vin);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void add() throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Adding new vehicle .. ");
		System.out.println("Please enter your vehicle Brand");
		String brand = sc.next();
		System.out.println("Please enter your vehicle Model");
		String model = sc.next();
		System.out.println("Please enter your vehicle Year");
		int year = sc.nextInt();
		System.out.println("Please enter your vehicle VIN Number");
		String vin = sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/first-project", "root", "123456");

			PreparedStatement ins = con.prepareStatement(
					"INSERT INTO dmv_vehicles (veh_brand,veh_model,veh_year,veh_vin_number ) VALUES (?,?,?,?)");

			ins.setString(1, brand);
			ins.setString(2, model);
			ins.setInt(3, year);
			ins.setString(4, vin);
			ins.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Added Successfuly .. ");
	}

}
