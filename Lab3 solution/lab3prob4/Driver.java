package lesson3.labs.prob4;

public class Driver {
	public static void main(String[] args) {
		City[] cities = { 
			new City("Chicago", "IL"),
			new City("Miami", "FL"), 
			new City("New York", "NY")
		};
		
		Address[] addresses = {
			new Address("Random Street 1", "1234", cities[0]),
			new Address("Random Street 2", "2345", cities[2]),
			new Address("Random Street 3", "3456", cities[2])
		};
		
		RentableProperty[] properties = { 
			new House(addresses[0], 9000), 
			new Condo(addresses[1], 2), 
			new Trailer(addresses[2]) 
		};
		
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);
		System.out.println(Admin.listProperty(properties, cities[2]));
	}
}