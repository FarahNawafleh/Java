package edu.htu.upskilling;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

//DAO: Data Access Object
public class VehicleDao{


	public void getAll() {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("first-project");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Query query = em.createQuery("SELECT v FROM Vehicle v");//JPQL
		List<Vehicle> resultList = query.getResultList();
		for (Vehicle vehicle : resultList) {
			System.out.println(vehicle);
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Select exectued Successfully");
	}

	public void find() {

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("first-project");
		EntityManager em = emf.createEntityManager();
		
		Query query = em.createQuery("SELECT v FROM Vehicle v WHERE v.vehBrand=?1");//JPQL
		query.setParameter(1, "Mercedes");
		List<Vehicle> resultList = query.getResultList();
		
		for (Vehicle vehicle : resultList) {
			System.out.println(vehicle);
		}
		
		em.close();
		emf.close();
		
		System.out.println("Select exectued Successfully");
	
	}
	
	public void delete() {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("upskilling");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Vehicle dr = em.find(Vehicle.class, 1);
		em.remove(dr);		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Deleted Successfully");
	}

	public void update(){
		Vehicle vehicle=new Vehicle();
		vehicle.setId(1);
		vehicle.setVehBrand("bmw");
		vehicle.setVehModel("bmw-");
		vehicle.setVehYear(2016);
		vehicle.setVehVin("1010");		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("upskilling");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(vehicle);		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Updated Successfully");
	}

	
	public void add(){

		Vehicle vehicle=new Vehicle();
		vehicle.setVehBrand("Kia");
		vehicle.setVehModel("Kia-");
		vehicle.setVehYear(2017);
		vehicle.setVehVin("1011");	
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("upskilling");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(vehicle);		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("Inserted Successfully");
	}

	/////////////////////////////////////////////////////////
//	private Vehicle fillVehicle(ResultSet rs){
//		Vehicle v = new Vehicle();
//		v.setVehBrand(rs.getString("veh_brand"));
//		v.setVehModel(rs.getString("veh_model"));
//		v.setVehYear(rs.getInt("veh_year"));
//		v.setVehVin(rs.getString("veh_vin"));
//		return v;
//	}

}
