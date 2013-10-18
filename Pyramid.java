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
		
		// This will loop through the rows
		for (int i = 0; i < BRICKS_IN_BASE; i++){
			
			// First set the Y height to be the bottom row
			// Take the height of the window and subtract the brick height
			// On the outer loop, reduce the Y height by the height of one brick
			
			int YPosition = getHeight()-i*BRICK_HEIGHT;
			
			// Once the Y height has been set for the outer loop, create an inner loop that lays the bricks down horizontally
			// First calculate the number of bricks on the row
			// Subtract a brick on each loop
			
			int brickBase = BRICKS_IN_BASE - i;
			
			
			// This inner loop lays down bricks horizontally
			for (int j = 0; j < brickBase; j++){
				int XPosition = (getWidth()-i*BRICK_WIDTH);
				
				GRect myBlock = new GRect(XPosition, YPosition, BRICK_WIDTH, BRICK_HEIGHT);
				add(myBlock);
				
				// 
			}
			
			
		}

	}
	
}

