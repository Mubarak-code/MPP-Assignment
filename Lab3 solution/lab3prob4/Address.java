package lesson3.labs.prob4;

public class Address {
	private String street;
	private String zipCode;
	private City city;
	
	public City getCity() { return city; }
	
	public Address(String street, String zipCode, City city) {
		super();
		this.street = street;
		this.zipCode = zipCode;
		this.city = city;
	}
	
	public String toString() {
		return this.street + "\n" + this.city.toString() + " " + this.zipCode; 
	}
}
