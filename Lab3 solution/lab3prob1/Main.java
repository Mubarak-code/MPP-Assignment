package lesson3.labs.prob1;

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person("Joe", new Job(30000));
		Person p2 = new Person("Joe", null);
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}