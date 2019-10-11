package lesson3.labs.prob3.a;

public class Cylinder {
	private double radius;
	public double height;
	
	public double getRadius() { return radius; }
	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	public double computeVolume() {
		return Math.PI*Math.pow(radius,2)*height;
	}
}
