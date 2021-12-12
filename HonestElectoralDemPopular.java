package assignFive;


	import java.time.LocalDateTime;
	import java.util.ArrayList;
	import java.util.Observable;
	import java.util.Observer;

	public class HonestElectoralDemPopular extends Elections implements Observer {
		private ArrayList<State> states;
		

		public HonestElectoralDemPopular(Observable observable)
		{
			observable.addObserver(this);
			pop = new Strategy2Pop();
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
		
			System.out.println("\nObserver 4:");
			displayMessage();
			String popular = pop.calculatePop(states);
			 String electoral = elec.calculateElec(states);		
			 projectedWinner(popular, electoral);


					

		}
		}
	


