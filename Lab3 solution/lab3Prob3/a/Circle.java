package lesson3.labs.prob3.a;

public class Circle extends Cylinder {
	public Circle(double radius) {
		super(radius,0);
	}
	public double computeArea() {
		return Math.PI*Math.pow(this.getRadius(),2);
	}
}
