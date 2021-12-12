package assignFive;


import java.util.ArrayList;

public class Strategy1Pop implements CalculatePop {

	@Override
	public String calculatePop(ArrayList<State> states) {
		double rePop = 0;
		double dePop = 0;
		for(int j= 0; j < states.size(); j++) {			
			rePop +=states.get(j).getRepublicanPopular();
			dePop += states.get(j).getDemocratPopular();
			
		}
		dePop = Math.round(dePop*.95);
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

