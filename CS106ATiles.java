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

	
	public void run(){
		
		for (int i = 0; i < 5; i++){
			add(filledCircle(i*100,i*100, 50, Color.black));
		}

		

	}
	
	private GOval filledCircle(int x, int y, int r, Color color){
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setFillColor(color);
		return circle;
	}

}

