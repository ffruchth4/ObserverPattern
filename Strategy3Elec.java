package assignFive;

import java.util.ArrayList;

public class Strategy3Elec implements CalculateElec {

	@Override
	public String calculateElec(ArrayList<State> states) {
		State highestElectoral = states.get(0);
		for(int k = 1; k < states.size(); k++) {
			if(states.get(k).getElectoral() > highestElectoral.getElectoral()) {
				highestElectoral = states.get(k);
			}
		}
		
		int reElec = 0;
		int deElec = 0;		
		for(int l = 0; l < states.size(); l++) {
			if(states.get(l) == highestElectoral) {
				deElec += highestElectoral.getElectoral();
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

