package lesson3.labs.prob4;

public class Trailer extends RentableProperty {
	public Trailer(Address address) {
		super(address);
	}
	
	public double computeRent(){
		return 500;
	}
	
	public String toString() {
		return "Trailer";
	}
}