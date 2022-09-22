package string;
class Emp{
	String name;
	int id;
	int salary;
	String address;
	public Emp(String name, int id, int salary, String address) {
	
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.address = address;
		
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (address == null) {
			if (other.address != null)
				return false;		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;		if (salary != other.salary)
			return false;
		return true;
	}
	
	
	
	
}

public class Mutable {
	

	public static void main(String[] args) {
		String s1="ssreddy";
		String s2="ssreddy";
		String s3=new String("ssreddy");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		if(s1.equals(s3)){
			System.out.println("s1 and s3 are equal");
	
			
		}else{
			System.out.println("s1 and s3 are not equal");
		}
		if(s1==s3){
			System.out.println("s1 and s3 are equal");
		}else{
			System.out.println("s1 and s3 are not equal");
		}
		Emp emp=new Emp("ssreddy",22034,50000,"hyd");
		Emp emp2=new Emp("ssreddy",22034,50000,"hyd");
		Emp emp3=new Emp("ssreddy",22034,50000,"hyd");
		System.out.println("print the hascode address");
		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());
		System.out.println(emp);
		System.out.println(emp2);
		System.out.println(emp3);
		if(emp==emp2){
			System.out.println("emp and emp2 are equal");
		}else{
			System.out.println("emp and emp2 are not  equal");
			
		}
		
	}
	

}
