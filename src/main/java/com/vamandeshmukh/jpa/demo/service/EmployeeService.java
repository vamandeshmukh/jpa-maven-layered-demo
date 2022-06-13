package com.vamandeshmukh.jpa.demo.service;

import java.util.List;

import com.vamandeshmukh.jpa.demo.dao.EmployeeDao;
import com.vamandeshmukh.jpa.demo.model.Employee;

public class EmployeeService implements IEmployeeService {

	private EmployeeDao dao = new EmployeeDao();

	@Override
	public List<Employee> viewAllEmployees() {
		return dao.getAllEmployees();
	}

	@Override
	public Employee viewEmployeeById(int eid) {
		return dao.getEmployeeById(eid);
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return dao.addEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return dao.updateEmployee(employee);
	}

	@Override
	public Employee deleteEmployee(int eid) {
		return dao.deleteEmployee(eid);
	}

}
