package assin2;

public class PartTimeEmployee extends Employee {

	public PartTimeEmployee(int empId, double basic, double allowance, double deductions, String firstName,
			String lastName, String address, String pincode) {
		super(empId, basic, allowance, deductions, firstName, lastName, address, pincode);
		
	}
	public double  calcSalary( double basic,double allowance,double deductions){
		
	    double partempsal=0;
	    partempsal= basic/2+allowance-deductions;
		return  partempsal;
	}
	

}
