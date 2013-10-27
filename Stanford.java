
import acm.program.*;

public class Stanford extends ConsoleProgram{
	
	public void run(){
		
		Student stud = new Student("Ben Smith", 1001);
		stud.setUnits(179);
		
		Frosh stud2 = new Frosh("Sam Smith", 1002);
		stud2.setUnits(179);
		
		println(stud2.getName() + " has " + stud2.getUnits() + " units.");
		println(stud2.getName() + " is a " + stud2.CLASS);
		
		
		println(stud.getName() + " has "+ stud.getUnits() + " units.");
		
		println(stud.getName() + " can graduate " + stud.hasEnoughUnits());
		
		println(stud.getName() + " takes CS106A");
		
		stud.incrementUnits(5);
		
		println(stud.getName() + " can graduate " + stud.hasEnoughUnits());
		
		println(stud.getUnits());
		
		if (stud.hasEnoughUnits()){
			println("Good times for " + stud.getName());
		}
		
		
	}
	

}
