package edu.htu.upskilling;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Vector;

public class DMV {


	public static void main(String[] args) {
//		Class.forName("com.mysql.cj.jdbc.Driver");
		boolean stop = false;
		while (!stop) {
			try {
				int ch = showMenu();
				switch (ch) {
				case 1:
					processAdd();
					break;
				case 2:
					processFind();
					break;
				case 3:
					processUpdate();
					break;
				case 4:
					processDelete();
					break;
				case 5:
					processShowAll();
					break;
				case 6:
					stop = true;
					break;
				default:
					System.out.println("Invalid Input");
				}
			} catch (Exception e) {
				System.out.println("Error occured with Message : " + e.getMessage());
				e.printStackTrace();
			}
		}
		System.out.println("========================================");
		System.out.println("Thank you, good bye");
	}


	private static int showMenu() {
		System.out.println("1- Add Vehicle");
		System.out.println("2- Find Vehicle");
		System.out.println("3- Update Vehicle");
		System.out.println("4- Delete Vehicle");
		System.out.println("5- Show All Vehicles");
		System.out.println("6- Quit");
		System.out.println("====================================");
		System.out.print("Please enter your choice: ");
		Scanner s = new Scanner(System.in);
		int ch = s.nextInt();
		return ch;
	}

	private static void processShowAll() {
		VehicleDao dao = new VehicleDao();
		dao.getAll();
	}

	private static void processDelete() {
		VehicleDao dao = new VehicleDao();
		dao.delete();
	}

	private static void processUpdate() {
		VehicleDao dao = new VehicleDao();
		dao.update();
	}

//	private static Vehicle getVehicleFromUser() {
//		Scanner s = new Scanner(System.in);
//		Vehicle vehicle = new Vehicle();
//		System.out.print("Enter Vin:");
//		vehicle.setVehVin(s.next());
//		System.out.print("Enter Brand:");
//		vehicle.setVehBrand(s.next());
//		System.out.print("Enter Model: ");
//		vehicle.setVehModel(s.next());
//		System.out.print("Enter Year:");
//		vehicle.setVehYear(s.nextInt());
//		return vehicle;
//	}

	private static void processFind() {
		VehicleDao dao = new VehicleDao();
		dao.find();
	}

	private static void processAdd() {
		VehicleDao dao = new VehicleDao();
		dao.add();
	}

}
