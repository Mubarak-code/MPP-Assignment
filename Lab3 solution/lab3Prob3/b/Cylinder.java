package lesson3.labs.prob3.b;

public class Cylinder {
	private double height;
	private Circle base;
	
	public Cylinder(double height, Circle base) {
		super();
		this.height = height;
		this.base = base;
	}

	public double computeVolume() {
		return base.getRadius()*height;
	}
}
