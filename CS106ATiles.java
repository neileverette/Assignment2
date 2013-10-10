/*
 * File: CS106ATiles.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

//import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class CS106ATiles extends ConsoleProgram  { //Replace with GraphicsProgram 
	
	/** Amount of space (in pixels) between tiles */
	private static final int TILE_SPACE = 20;

	public void run() {
		/* You fill this in. */
		
		println("This adds two numbers");
		int n1 = readInt("Enter first number: ");
		int n2 = readInt("Enter second number: ");
		int n3 = n1 + n2;
		println("The total is " + n3 + ".");
	}
}

