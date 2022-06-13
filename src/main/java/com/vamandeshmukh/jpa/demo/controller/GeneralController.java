package com.vamandeshmukh.jpa.demo.controller;

import java.util.Scanner;

public class GeneralController {

	private Scanner sc = new Scanner(System.in);
	private EmployeeController employeeController;

	public void selectOption() {
		if (null == employeeController)
			employeeController = new EmployeeController();

		System.out.println("\nPlease select an option to continue:");
		System.out.println(
				"\n1. View all employees\n2. View employee by id \n3. Add new employee\n4. Update employee \n5. Delete employee\n6. Exit");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			employeeController.getAllEmps();
			break;
		case 2:
			employeeController.getEmpById();
			break;
		case 3: {
			employeeController.addEmp();
			break;
		}
		case 4:
			employeeController.updateEmp();
			break;
		case 5:
			employeeController.deleteEmp();
			break;
		case 6:
			this.exit();
			break;

		default:
			System.out.println("Please select the correct option:");
			this.selectOption();
			break;
		}

	}

//	private void pressAnyKeyToContinue() {
//		System.out.println("Press Enter key to continue...");
//		try {
//			System.in.read();
//		} catch (Exception e) {
//			System.out.println("Something is wrong!");
//			this.selectOption();
//		}
//	}

	public void exit() {
		System.out.println("Thank for using the app.");
		this.sc.close();
		System.exit(0);
	}
}
