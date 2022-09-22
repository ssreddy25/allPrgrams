package assin2;

public class FullTimeEmployee extends Employee {

	public FullTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode) {
		super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
		// TODO Auto-generated constructor stub
	}
public double  calcSalary( double basic,double allowance,double deductions){
		
	    double fullempsal=0;
	    fullempsal= basic+allowance+1000-deductions;
		return  fullempsal;
	}

}
