package lesson3.labs.prob3.b;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	public double getRadius() { return radius; }
	public double computeArea() { return Math.PI*Math.pow(radius,2); }
}
