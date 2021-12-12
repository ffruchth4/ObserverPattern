package assignFive;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Honest extends Elections implements Observer{

	public Honest(Observable observable)
	{
		observable.addObserver(this);
		pop = new Strategy3Pop();
		elec = new Strategy5Elec();
	}

	@Override
	public void update(Observable observable, Object arg) {
		if(arg instanceof VotingStation.VotingStats ){
			VotingStation.VotingStats votingStats = (VotingStation.VotingStats)arg; 
			this.states = votingStats.getStates();
			display();
		}
		
	}
	
	public void display()
	{
		System.out.println("\nObserver 5:");
		displayMessage();
		String popular = pop.calculatePop(states);
		 String electoral = elec.calculateElec(states);		
		 projectedWinner(popular, electoral);

	}
		
	

}

