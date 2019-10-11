package Sol;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub







Renter r1=new Renter("Renter 1", 200);
Renter r2=new Renter("Renter 2", 400);
Renter r3=new Renter("Renter 3", 600);
Renter r4=new Renter("Renter 4", 800);
Renter r5=new Renter("Renter 5", 1000);
Renter r6=new Renter("Renter 6", 1200);
Renter r7=new Renter("Renter 7", 1400);



Apartment ap1 =new Apartment("1", r1);
Apartment ap2 =new Apartment("1", r2);
Apartment ap3 =new Apartment("1", r3);
Apartment ap4 =new Apartment("1", r4);
Apartment ap5 =new Apartment("1", r5);
Apartment ap6 =new Apartment("1", r6);
Apartment ap7 =new Apartment("1", r7);


ArrayList<Apartment> lstB1=new ArrayList<>();
lstB1.add(ap1);
lstB1.add(ap2);
lstB1.add(ap3);
lstB1.add(ap4);


ArrayList<Apartment> lstB2=new ArrayList<>();
lstB2.add(ap5);
lstB2.add(ap6);
lstB2.add(ap7);


Building b1 =new Building("1", lstB1);
Building b2 =new Building("1", lstB2);


ArrayList<Building> lstB=new ArrayList<>();
lstB.add(b1);
lstB.add(b1);


Landlord owner = new Landlord("Owner Naame", lstB);


System.out.print("Total Value: "+owner.GetTotalRent());
	}

}
