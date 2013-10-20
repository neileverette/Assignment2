/*
 * File: CS106ATiles.java
 * Name: 
 * Section Leader: 
 * ----------------------
 * This file is the starter file for the CS106ATiles problem.
 */

import acm.graphics.*;
import acm.program.*;
//import java.awt.*;
//import acm.util.*;



public class CS106ATiles extends GraphicsProgram  { //Replace with GraphicsProgram 
	
	private static final int WIDTH = 5;
	private static final int HEIGHT = 10;
	
	public void run(){
		
		int boxWidth = getWidth()/WIDTH;
		int boxHeight = getHeight()/WIDTH;
	
		add(box(200, 10, boxWidth, boxHeight, "Program"));
		add(box(10, 100, boxWidth, boxHeight, "GraphicsProgram"));
	}
	
	private GRect box(int x, int y, int width, int height, String label){
		GRect myRect = new GRect(x,y, width,height);
		add(label(label, x, y));
		return myRect;
	}
	
	private GLabel label(String str, int labelX, int labelY ){
		
		GLabel myLabel = new GLabel(str, labelX, labelY);
		
		double labelWidth = myLabel.getWidth();
		double labelHeight = myLabel.getAscent();
		
		myLabel.setLocation(labelX+((WIDTH-labelWidth)/2),labelY + HEIGHT/2 + labelHeight/2);
		return myLabel;
	}
}

