package com.vamandeshmukh.jpa.demo.dao;

import java.util.List;

import javax.persistence.EntityExistsException;

import com.vamandeshmukh.jpa.demo.model.Employee;

public interface IEmployeeDao {

	public abstract List<Employee> getAllEmployees();

	public abstract Employee getEmployeeById(int eid);

	public abstract Employee addEmployee(Employee employee) throws EntityExistsException;

	public abstract Employee updateEmployee(Employee employee);

	public abstract Employee deleteEmployee(int eid);

}
