package assignFive;

import java.util.ArrayList;

public class Strategy1Elec implements CalculateElec{

	@Override
	public String calculateElec(ArrayList<State> states) {
		int reElec = 0;
		int deElec = 0;		
		for(int l = 0; l < states.size(); l++) {
			if(l == 3) {
				reElec += states.get(l).getElectoral();
			}
			else if(states.get(l).getRepublicanPopular() > states.get(l).getDemocratPopular()) {
				reElec += states.get(l).getElectoral();
			}
			else {
				deElec += states.get(l).getElectoral();
			}
		}	
		System.out.println("Electoral Vote: Republican " + reElec + " Democratic " + deElec);
		
		if(reElec > deElec) {
			return "Republican";
		}
		else if(deElec > reElec) {
			return "Democrat";
		}
		else {
			return "Equal";
		}
		
	}

}

