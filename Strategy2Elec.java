package assignFive;


import java.util.ArrayList;

public class Strategy2Elec implements CalculateElec{

	@Override
	public String calculateElec(ArrayList<State> states) {
		State smallestLead = states.get(0);
		//int smallestLead = states.get(0).getDemocratPopular() - states.get(0).getRepublicanPopular();
		int lead;
		for(int i = 1; i < states.size(); i++) {
			lead = states.get(i).getDemocratPopular() -states.get(i).getRepublicanPopular();
			if(lead < smallestLead.getDemocratPopular() - smallestLead.getRepublicanPopular() ) {
				smallestLead = states.get(i);
			}
		}
		int reElec = 0;
		int deElec = 0;		
		for(int l = 0; l < states.size(); l++) {
			if(states.get(l) == smallestLead) {
				if(states.get(l).getElectoral() % 2 == 0) {
					reElec += (states.get(l).getElectoral() /2);
					deElec += (states.get(l).getElectoral() /2);
				}
				else {
					reElec += (states.get(l).getElectoral() /2) +1;
					deElec += (states.get(l).getElectoral() /2);
				}
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



