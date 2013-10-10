/*
 * File: CS106ATiles.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class CS106ATiles extends GraphicsProgram  { //Replace with GraphicsProgram 
	
	/** Amount of space (in pixels) between tiles */
	private static final int TILE_SPACE = 20;

	public void run() {
		/* You fill this in. */
		
		GLabel label = new GLabel("Hello World", 100,75);
		label.setFont("Roboto-Bold-36");
		label.setColor(Color.RED);
		
		GRect rectangle = new GRect(10, 10, 100, 50);
		
		add(rectangle);
		add(label);
	}
}

