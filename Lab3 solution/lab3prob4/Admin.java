package lesson3.labs.prob4;

public class Admin {
	public static double computeTotalRent(RentableProperty[] properties) {
		double totalRent = 0;
		for (RentableProperty o : properties) {
			totalRent += o.computeRent();
		}
		return totalRent;
	}
	
	public static String listProperty(RentableProperty[] properties, City city) {
		String output = "List of Properties of " +city.toString()+"\n";
		for (RentableProperty o : properties) {
			if(o.getAddress().getCity().equals(city)) {
				output += o.getPropertyInformation() + "\n";
			}
		}
		return output;
	}
}