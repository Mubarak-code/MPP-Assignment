package Sol;

import java.util.ArrayList;

public class Landlord {

	public String Name ;
	public ArrayList<Building> Buildings;

	public Landlord(String pName ,ArrayList<Building> pBuildings) {
		Name=pName;
		Buildings=pBuildings;
	}
	
	public double GetTotalRent() {
		if(Buildings==null) return 0;
		double sum =0;
		for (int i = 0; i < Buildings.size();i++) {
			sum+=Buildings.get(i).GetTotalRent();
	}
		return sum;
	}
		
}
