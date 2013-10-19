/*
 * File: Target.java
 * Name: 
 * Section Leader: 
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {	
	public void run() {
		
		int circle1 = 72;
		
		
		int x = getWidth()/2;
		int y = getHeight()/2;
		
		add(filledCircle(x, y, 2, Color.RED));
	
		
	}
	
	private GOval filledCircle(int x, int y, int r, Color color){
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
		
	}
	
}
