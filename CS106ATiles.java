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
import acm.util.*;

public class CS106ATiles extends GraphicsProgram  { //Replace with GraphicsProgram 
	
	
	public void run(){
	
		add(box(10, 10, 30, 100));
		
	}
	
	private GRect box(int x, int y, int width, int height){
		GRect myRect = new GRect(x,y, width,height);
		return myRect;
		
	}
}

