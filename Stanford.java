
import acm.program.*;

public class Stanford extends ConsoleProgram{
	
	public void run(){
		
		Student stud = new Student("Ben Smith", 1001);
		stud.setUnits(179);
		
		println(stud.getName() + " has "+ stud.getUnits());
		
		println(stud.getName() + " can graduate " + stud.hasEnoughUnits());
		
		println(stud.getName() + " takes CS106A");
		
		stud.incrementUnits(5);
		
		println(stud.getName() + " can graduate " + stud.hasEnoughUnits());
		
		if (stud.hasEnoughUnits()){
			println("Good times for " + stud.getName());
		}
		
		
		
		
	}
	

}
