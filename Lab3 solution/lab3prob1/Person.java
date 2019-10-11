package lesson3.labs.prob1;


public class Person {

	private String name;
	private Job job;
	
	Person(String n, Job j) {
		name = n;
		job = j;
	}
	public String getName() {
		return name;
	}
	public Job getJob() {
		return job;
	}
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof Person)) return false;
		Person p = (Person)aPerson;
		boolean isEqual = this.name.equals(p.name);
		isEqual = isEqual && (this.getJob() == p.getJob() || (this.getJob() != null && this.getJob().equals(p.getJob())));
		return isEqual;
	}

}