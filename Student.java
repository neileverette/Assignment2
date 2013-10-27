
public class Student {
	

	public Student(String name, int id) {
		studentName = name;
		studentID = id;
	}


	// Gets student's name 
	public String getName(){
		return studentName;
	}
		
	// Gets student's ID
	public int getID(){
		return studentID;
	}
	
	// Sets units
	public void setUnits(double units){
		unitsEarned = units;
	}
	
	// Returns units earned
	public double getUnits(){
		return unitsEarned;
	}
	
	// Increments units
	public void incrementUnits(double additionalUnits){
		unitsEarned += additionalUnits;
	}
	
	
	// Method to see if you can graduate
	public boolean hasEnoughUnits(){
		return (unitsEarned >= UNITS_TO_GRADUATE);
	}
	
	public String toString(){
		return studentName + " " + studentID;
	}
		
	// Public constants
	public static final double UNITS_TO_GRADUATE = 180;
		
		
	// Instance variables 
	private String studentName;
	private int studentID;
	private double unitsEarned;

}
