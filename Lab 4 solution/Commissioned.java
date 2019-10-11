import java.util.*;
public class Commissioned extends Employee {
private double commission;
private double baseSalary;


public ArrayList<Order> orders ;



public double calcGrossPay(int month , int year)
{
if(orders==null) return baseSalary;
	
	double totalCompensation=0;
	
	// Compensation on previous month
	int compensationMonth= month-1; 
	int compensationYear =year;
	if(month==1)
	{
		compensationMonth = 12;
		compensationYear=year-1;		
	}
	
	
	for (int i = 0; i < orders.size(); i++) {
		Order orderItem =orders.get(i); 
		
		if(orderItem.empId==this.empId 
				&& orderItem.orderDate.getYear()==compensationYear 
				&&  orderItem.orderDate.getMonth()==compensationMonth)
			totalCompensation+=orderItem.orderAmount;
	}
	
	return baseSalary +totalCompensation * commission ;
}
}
