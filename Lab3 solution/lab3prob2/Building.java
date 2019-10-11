package Sol;
import java.util.*;
public class Building {
public String BuildingNo ;
public ArrayList<Apartment> Apartments;

public Building (String pBuildingNo , ArrayList<Apartment> pApartments) {
	BuildingNo=pBuildingNo;
	Apartments=pApartments;
}

public double GetTotalRent() {
	if(Apartments==null) return 0;
	double sum =0;
	for (int i = 0; i < Apartments.size();i++) {
		sum+=Apartments.get(i).GetRentValue();
}
	return sum;
}
}
