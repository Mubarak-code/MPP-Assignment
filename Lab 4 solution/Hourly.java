
public class Hourly extends Employee{

	private int hourlyWage;
	private int hoursPerWeek;
	

	
	public double calcGrossPay(int month , int year)
	{
		return hourlyWage* hoursPerWeek * 4;
	}
}
