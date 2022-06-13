package com.vamandeshmukh.jpa.demo.service;

import java.util.List;

import com.vamandeshmukh.jpa.demo.model.Employee;

public interface IEmployeeService {

	public List<Employee> viewAllEmployees();

	public Employee viewEmployeeById(int eid);

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public Employee deleteEmployee(int eid);

}
