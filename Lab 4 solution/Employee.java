
public abstract class Employee {
public int empId;
public void print()
{
}

public Paycheck calcCompensation(int month , int year)
{
	double gross= calcGrossPay(month,year);
	Paycheck p=new Paycheck(gross, gross*.23, gross*.05, gross*.01, gross*.03, gross *.075);
	return p;
}



 abstract double calcGrossPay(int month , int year);
 

}
