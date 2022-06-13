package com.vamandeshmukh.jpa.demo.controller;

import java.util.List;
import java.util.Scanner;

import com.vamandeshmukh.jpa.demo.model.Employee;
import com.vamandeshmukh.jpa.demo.service.EmployeeService;

public class EmployeeController {

	private EmployeeService service = new EmployeeService();
	private Scanner sc = new Scanner(System.in);
	private GeneralController genCon = new GeneralController();

	public void getAllEmps() {
		List<Employee> empList = service.viewAllEmployees();
		for (Employee e : empList)
			System.out.println(e.toString());
		genCon.selectOption();

	}

	public void getEmpById() {
		System.out.println("Please enter eid to search:");
		int eid = sc.nextInt();
		Employee emp = service.viewEmployeeById(eid);
		System.out.println(emp.toString());
		genCon.selectOption();
	}

	public void addEmp() {
		System.out.println("Please enter Employee details:\n");
		System.out.println("eid:");
		int eid = sc.nextInt();
		System.out.println("firstName:");
//		String firstName = sc.next();
		String firstName = sc.nextLine();
		System.out.println("salary:");
		double salary = sc.nextDouble();
		Employee empToAdd = new Employee(eid, firstName, salary);
		service.addEmployee(empToAdd);
		System.out.println(empToAdd.toString());
		genCon.selectOption();
	}

	public void updateEmp() {
		System.out.println("Please enter Employee details:\n");
		System.out.println("eid:");
		int eid = sc.nextInt();
		System.out.println("firstName:");
		String firstName = sc.next();
		System.out.println("salary:");
		double salary = sc.nextDouble();
		Employee empToUpdate = new Employee(eid, firstName, salary);
		service.updateEmployee(empToUpdate);
		System.out.println(empToUpdate.toString());
		System.out.println("Employee updated successfully.");
		genCon.selectOption();
	}

	public void deleteEmp() {
		System.out.println("Please enter eid to delete an employee:");
		int eid = sc.nextInt();
		Employee empToDelete = service.viewEmployeeById(eid);
		System.out.println(empToDelete.toString());
		System.out.println("Are you sure to delete this employee?");
		System.out.println("1. Yes\n2. No");
		int confirm = sc.nextInt();
		switch (confirm) {
		case 1:
			service.deleteEmployee(eid);
			System.out.println("Employee deleted successfully.");
			genCon.selectOption();
			break;
		case 2:
			System.out.println("Employee not deleted.");
			genCon.selectOption();
		default:
			System.out.println("Please select proper option:");
			this.deleteEmp();
			break;
		}
	}
}
