package assignFive;

import java.util.ArrayList;
import java.util.Observable;
import java.util.HashSet;


public class VotingStation extends Observable{
	//object used for pushing information
	public class VotingStats{
		private ArrayList<State> states;
		
		public VotingStats(ArrayList<State> states) {
			this.states = states;
		}
		public ArrayList<State> getStates() {
			return states;
		}
		
	}
	
	private ArrayList<State> states;
	
	public void numbersChanged()
	{
		System.out.println();
		System.out.println("***STATS CHANGED***");
		setChanged();
		/*
		 * We used the push version by sending an Object to 
		 * the notifyObservers method.
		 */
		notifyObservers(new VotingStats(states));
	}
	public void setStates(ArrayList<State> states)
	{
		this.states = states;
		numbersChanged();
	}
	
}
