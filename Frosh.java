
public class Frosh extends Student{
	
	public Frosh(String name, int id){
		super(name, id);
		setUnits(0);
	}
	
	public String toString(){
		return ("Frosh: " + getName() + 
				" (#" + getID() + ")");
	}
	
	public static final String CLASS = "Freshman";

}
