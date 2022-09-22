package oops;

public class Employee {
	int id;
	String fristName;
	String LastName;
	double salary;
	public Employee(int id, String fristName, String lastName, double salary) {
	
		this.id = id;
		this.fristName = fristName;
		LastName = lastName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getFristName() {
		return fristName;
	}
	public String getLastName() {
		return LastName;
	}
	public double getSalary() {
		return salary;
	}
	
	public double getAnnulay(){
		return 12*this.salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", fristName=" + fristName + ", LastName=" + LastName + ", salary=" + salary
				+ "]";
	}
	
}
