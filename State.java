package assignFive;

public class State {
	private String name;
	private int republicanPopular;
	private int democratPopular;
	private int electoral;
	public State(String name, int republicanPopular, int democratPopular, int electoral) {
		this.name = name;
		this.republicanPopular = republicanPopular;
		this.democratPopular = democratPopular;
		this.electoral = electoral;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRepublicanPopular() {
		return republicanPopular;
	}
	public void setRepublicanPopular(int republicanPopular) {
		this.republicanPopular = republicanPopular;
	}
	public int getDemocratPopular() {
		return democratPopular;
	}
	public void setDemocratPopular(int democratPopular) {
		this.democratPopular = democratPopular;
	}
	public int getElectoral() {
		return electoral;
	}
	 
	public void setElectoral(int electoral) {
		this.electoral = electoral;
	}
	

}

