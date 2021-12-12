package assignFive;


import java.util.ArrayList;

public class Strategy2Pop implements CalculatePop{

	@Override
	public String calculatePop(ArrayList<State> states) {
		State highest = states.get(0);
		for(int i = 1; i < states.size(); i++) {
			if(states.get(i).getRepublicanPopular() > highest.getRepublicanPopular()) {
				highest = states.get(i);
			}
		}
		double rePop = 0;
		double dePop = 0;
		for(int j= 0; j < states.size(); j++) {
			if(states.get(j) == highest) {}
			else {
				rePop +=states.get(j).getRepublicanPopular();
				dePop += states.get(j).getDemocratPopular();
			}
		}
	
		System.out.print("Popular Vote: Republican ");
		System.out.printf("%,.0f", rePop );
		System.out.print(" Democratic ");
		System.out.printf("%,.0f\n", dePop);
		
		if(rePop > dePop) {
			return "Republican";
		}
		else if(dePop > rePop) {
			return "Democrat";
		}
		else {
			return "Equal";
		}
	}

}

