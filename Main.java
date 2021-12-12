package assignFive;

	import java.util.ArrayList;

	public class Main {
		public static void main(String[] args) {
			VotingStation vs = new VotingStation();
			Honest observer5 = new Honest(vs);
			HonestElectoralDemPopular observer4 = new HonestElectoralDemPopular(vs);
			DemPopularRepubElectoral observer3 = new DemPopularRepubElectoral(vs);
			Democrat observer2 = new Democrat(vs);	
			Republican observer1 = new Republican(vs);
			
			
			State state1 = new State("New York", 2500,  6500, 29);
			State state2 = new State("Florida", 9300, 8700, 29 );
			State state3 = new State("New Jersey", 2800 ,4600, 14 );
			State state4 = new State("Virginia", 6500, 1900, 13);
			State state5 = new State("Texas", 12200, 5000, 38);
			ArrayList<State> states = new ArrayList<State>();
			states.add(state1);
			states.add(state2);
			states.add(state3);
			states.add(state4);
			states.add(state5);
			vs.setStates(states);
			
			changeStats(vs);
		}
		
			public static void changeStats(VotingStation vs)
			{
			
			State sta1 = new State("Pennsylvania", 4500,  5700, 20);
			State sta2 = new State("Indiana", 7300, 5700, 11 );
			State sta3 = new State("Michigan", 3300 ,3000, 16 );
			State sta4 = new State("Ohio", 6500, 2700, 18);
			State sta5 = new State("Washington", 4800, 7800, 12);
			ArrayList<State> manyStates = new ArrayList<State>();
			manyStates.add(sta1);
			manyStates.add(sta2);
			manyStates.add(sta3);
			manyStates.add(sta4);
			manyStates.add(sta5);
			vs.setStates(manyStates);
			
			
			State st1 = new State("Kentucky", 5300,  2600, 8);
			State st2 = new State("North Dakota", 7300, 5700, 3 );
			State st3 = new State("Oklahoma", 3900 ,2500, 7 );
			State st4 = new State("Arkansas", 2500, 6500, 6);
			State st5 = new State("Colorado", 4800, 7800, 9);
			ArrayList<State> manyState = new ArrayList<State>();
			manyState.add(st1);
			manyState.add(st2);
			manyState.add(st3);
			manyState.add(st4);
			manyState.add(st5);
			vs.setStates(manyState);
			
		}
		
		
		
		
	}



