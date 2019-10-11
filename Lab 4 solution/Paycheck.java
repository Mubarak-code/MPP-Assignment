
public final class Paycheck {
public double grossPay;
public double fica;
public double state;
public double local;
public double medicare;
public double socialSecurity;



public  Paycheck(double p_grossPay,double p_fica,double p_state,double p_local,double p_medicare,double p_socialSecurity) 
{	
	grossPay=p_grossPay;
	fica=p_fica;
	state=p_state;
	local=p_local;
	medicare=p_medicare;
	socialSecurity=p_socialSecurity;
}

public void print(){
	
}

public void getNetPay() {
	
}

}
