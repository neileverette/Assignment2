/*
 * File: PythagoreanTheorem.java
 * Name: 
 * Section Leader: 
 * -----------------------------
 * This file is the starter file for the PythagoreanTheorem problem.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		
		println("Enter values to compute Pythagorean theorem");
		
		double valueA = readInt("Enter first number:");
		double valueB = readInt("Enter second number:");
		
		double y = valueA*valueA + valueB*valueB;
		y = Math.sqrt(y);
		
		println(y);
	}
}
