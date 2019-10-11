package lesson3.labs.prob4;

public abstract class RentableProperty implements Rentable {
		private Address address;

		public RentableProperty(Address address) { this.address = address; }
		
		public Address getAddress() { return address; }

		public String getPropertyInformation() {
			return this.toString() + "\n" + "Rent Value: $ " + this.computeRent() + "\n" + this.getAddress().toString();
		}
		
		@Override
		abstract public String toString();
		
		@Override
		abstract public double computeRent();
}
