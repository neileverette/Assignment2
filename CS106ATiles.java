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
	
	private static final int WIDTH = 100;
	private static final int HEIGHT = 30;
	
	public void run(){
	
		add(box(10, 10, WIDTH, HEIGHT));
		
	}
	
	private GRect box(int x, int y, int width, int height){
		GRect myRect = new GRect(x,y, width,height);
		add(label("This is a label", x, y));
		return myRect;
	}
	
	private GLabel label(String str, int labelX, int labelY ){
		
		GLabel myLabel = new GLabel(str, labelX, labelY);
		
		double width = myLabel.getWidth();
		
		myLabel.setLocation(width-WIDTH/2,100);
		return myLabel;
	}
}

