package com.app.controllers;

import java.util.List;

import javax.faces.bean.ManagedBean;

import com.app.models.Employee;
import com.jk.db.dataaccess.orm.JKObjectDataAccess;
import com.jk.db.datasource.JKDataAccessFactory;
import com.jk.util.JK;
import com.jk.web.faces.mb.JKManagedBean;

@ManagedBean(name = "mbEmployee")
public class MBEmployee extends JKManagedBean {
	private JKObjectDataAccess dao = JKDataAccessFactory.getObjectDataAccess();
	private Employee emp = new Employee();

	public JKObjectDataAccess getDao() {
		return dao;
	}

	public void setDao(JKObjectDataAccess dao) {
		this.dao = dao;
	}

	public Employee getEmp() {
		if (emp == null) {
			emp = new Employee();
		}
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String save() {
		dao.insert(emp);
		success("Record Added success");
		return null;
	}

	public List<Employee> getEmployees() {
		return dao.getList(Employee.class);
	}

	// Unit testing
	public static void main(String[] args) {
		MBEmployee mb = new MBEmployee();
		List<Employee> employees = mb.getEmployees();
		for (Employee employee : employees) {
			JK.print(employee);

		}
	}

	public String reset() {
		emp = null;
		return null;
	}
	public String update() {
		return null;
	}
	public String delete() {
		return null;
	}
	
}

