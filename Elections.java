package assignFive;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Observable;

public abstract class Elections {
	protected ArrayList<State> states;
	protected CalculatePop pop;
	protected CalculateElec elec;
	protected String DATE_FORMATTER= "yyyy-MM-dd HH:mm";
	
	public abstract void update(Observable observable, Object State);
	public abstract void display();
	
	
	public void displayMessage()
	{
		System.out.println("All reports are purely observational and not legally binding in any way.");
		LocalDateTime now = LocalDateTime.now(); 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DATE_FORMATTER);
	    String formatDateTime = now.format(formatter);

	     System.out.println("Current Time: " +formatDateTime);
	     
	}
	
	public void projectedWinner(String popular, String electoral)
	{
		if(popular.equals("Republican") )
		{
			System.out.println("Projected Popular Vote Winner: Republican");
		}
		else if(popular.equals("Democrat"))
		{
			System.out.println("Projected Popular Vote Winner: Democrat");
		}
		else // if it comes out equal
		{
			System.out.println("Projected Popular Vote Winner: Hard to call.");
		}
		
		
		if(electoral.equals("Republican"))
		{
			System.out.println("Projected Electoral Vote Winner: Republican");
		}
		else if(electoral.equals("Democrat"))
		{
			System.out.println("Projected Electoral Vote Winner: Democrat");
		}
		else // if it comes out equal
		{
			System.out.println("Projected Electoral Vote Winner: Hard to call.");
		}
	}
}
