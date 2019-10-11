package lesson3.labs.prob4;

public class House extends RentableProperty {
	private double lotSize;
	
	public House(Address address, double lotSize) {
		super(address);
		this.lotSize = lotSize;
	}

	public double computeRent(){
		return 0.1 * lotSize;
	}
	
	public String toString() {
		return "House (Lot Size " + lotSize + " m2)";
	}
}