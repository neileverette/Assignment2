/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

/** Height of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;

	
	public void run() {
		
		
		int yPosition = getHeight();
		int base = BRICKS_IN_BASE;
		
		// This will loop through the rows
		for (int i = 0; i < BRICKS_IN_BASE; i++){
			
			base = BRICKS_IN_BASE--;
			
			int xPosition = 0+i*BRICK_WIDTH;
			GRect myBlock = new GRect(xPosition,BRICK_HEIGHT, BRICK_WIDTH, BRICK_HEIGHT);
			add(myBlock);
		}

	}
	
}

