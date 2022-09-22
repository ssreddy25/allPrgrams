package assin2;

public class Employee {
	public int empId;
	private double sal = 0;
	public double basic;
	public double allowance;
	public double deductions;
	public String firstName;
	public String lastName;
	public String address;
	public String pincode;
	public double getSal() {
		return sal;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String realName(String fristName1,String lastName1){
		
	           String realName = null;
		if(firstName.equals(fristName1)&&lastName.equals(lastName1)){
			return realName=fristName1+" "+lastName1;
		}
		return realName;
	}
	public double  calcSalary( double basic,double allowance,double deductions){
		sal= basic+allowance-deductions;
		return  sal;
		
	}
	public Employee(int empId, double basic, double allowance, double deductions, String firstName, String lastName,
			String address, String pincode) {
		
		this.empId = empId;
		this.basic = basic;
		this.allowance = allowance;
		this.deductions = deductions;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.pincode = pincode;
	}

	
}
