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
		
		double valueA = readInt("A:");
		double valueB = readInt("B:");
		
		double valueC = valueA*valueA + valueB*valueB;
		valueC = Math.sqrt(valueC);
		
		println("C: = " + valueC);
	}
}
