package Sol;

public class Apartment {
public String ApartmentNo;
public Renter Per;

public Apartment (String pApartmentNo ,Renter  pPer) {
	ApartmentNo=pApartmentNo;
	Per=pPer;
}

public double GetRentValue() {
	if(Per==null) return 0;
	return Per.RentValue;
}
}
