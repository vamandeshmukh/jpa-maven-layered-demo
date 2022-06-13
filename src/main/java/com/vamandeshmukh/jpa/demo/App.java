package com.vamandeshmukh.jpa.demo;

import com.vamandeshmukh.jpa.demo.controller.GeneralController;

/**
 * 
 * @author Vaman Deshmukh
 * 
 *         {@link https://github.com/vamandeshmukh/jpa-maven-layered-demo}
 * 
 * @apiNote JPA layered demo project
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("--- Welcome to HR Management Application ---\n");
		GeneralController genCon = new GeneralController();
		genCon.selectOption();
	}
}
