package com.vamandeshmukh.jpa.demo.dao;

import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;

import com.vamandeshmukh.jpa.demo.model.Employee;
import com.vamandeshmukh.jpa.demo.utility.JpaUtility;

public class EmployeeDao implements IEmployeeDao {

	private EntityManager manager;

	public EmployeeDao() {
		super();
		manager = JpaUtility.getEntityManager();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAllEmployees() {
		manager.getTransaction().begin();
		String sqlString = "SELECT * FROM empt";
		List<Employee> empList = manager.createNativeQuery(sqlString, Employee.class).getResultList();
		manager.getTransaction().commit();
		return empList;
	}

	@Override
	public Employee getEmployeeById(int eid) {
		manager.getTransaction().begin();
		Employee selectedEmployee = manager.find(Employee.class, eid);
		manager.getTransaction().commit();
		manager.clear();
		return selectedEmployee;
	}

	@Override
	public Employee addEmployee(Employee employee) throws EntityExistsException {
		manager.getTransaction().begin();
		manager.persist(employee);
		manager.getTransaction().commit();
		return employee;

	}

	@Override
	public Employee updateEmployee(Employee employee) {
		manager.getTransaction().begin();
		Employee updatedEmployee = manager.merge(employee);
		manager.getTransaction().commit();
		return updatedEmployee;
	}

	@Override
	public Employee deleteEmployee(int eid) {
		manager.getTransaction().begin();
		Employee empToDelete = manager.find(Employee.class, eid);
		manager.remove(empToDelete);
		manager.getTransaction().commit();
		return empToDelete;
	}

}
