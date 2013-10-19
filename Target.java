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
		
		double radius1 = 1*72/2;
		double radius2 = .65*72/2;
		double radius3 = .3*72/2;
		
		
		int x = getWidth()/2;
		int y = getHeight()/2;
		
		add(filledCircle(x, y, radius1, Color.RED));
		add(filledCircle(x, y, radius2, Color.WHITE));
		add(filledCircle(x, y, radius3, Color.RED));
		
	}
	
	private GOval filledCircle(int x, int y, double r, Color color){
		GOval circle = new GOval(x-r, y-r, 2*r, 2*r);
		circle.setFilled(true);
		circle.setColor(color);
		return circle;
		
	}
	
}
