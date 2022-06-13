package com.vamandeshmukh.jpa.demo;

import com.vamandeshmukh.jpa.demo.controller.GeneralController;

/**
 * 
 * @author Vaman Deshmukh
 *         {@link https://github.com/vamandeshmukh/com-cg-jpa-demo-may12}
 * @apiNote JPA and Hibernate demo project
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("--- Welcome to HR Management Application ---\n");
		GeneralController controller = new GeneralController();
		controller.selectOption();
		System.out.println("End");
	}
}
