package lesson3.labs.prob4;

public class City {
	private String name;
	private String state;
	
	public City(String name, String state) {
		super();
		this.name = name;
		this.state = state;
	}
	
	public String toString() {
		return this.name + " " + this.state;
	}
}
