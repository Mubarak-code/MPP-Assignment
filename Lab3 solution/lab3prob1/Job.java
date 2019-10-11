package lesson3.labs.prob1;

public class Job {
	private double salary;
	
	public boolean equals(Object aJob) {
		if(aJob == null) return false; 
		if(!(aJob instanceof Job)) return false;
		Job p = (Job)aJob;
		boolean isEqual =  this.getSalary()==p.getSalary();
		return isEqual;
	}
	
	public Job(double s) {
		salary = s;
	}
	
	public double getSalary() {
		return salary;
	}
}
