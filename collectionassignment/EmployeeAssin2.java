package collectionassignment;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * 
 * @author ojas
 *2). Define a class Employee , make Employee classes objects  and add them to LinkedList.
 * Read those objects to print the value on console output. 
 *
 *
 */
public class EmployeeAssin2 {
	public String empName;
	public int empId;
	public String empMailld;
	public long moble;
	public String address;
	

	public EmployeeAssin2(String empName, int empId, String empMailld, long moble, String address) {
	
		this.empName = empName;
		this.empId = empId;
		this.empMailld = empMailld;
		this.moble = moble;
		this.address = address;
	}


	@Override
	public String toString() {
		return "EmployeeAssin2 [empName=" + empName + ", empId=" + empId + ", empMailld=" + empMailld + ", moble="
				+ moble + ", address=" + address + "]";
	}


	public static void main(String[] args) {
		
		EmployeeAssin2 emp=new EmployeeAssin2("chandhu",22039,"chandhu@gmail.com",234567890,"Blaari");
		EmployeeAssin2 emp1=new EmployeeAssin2("siva",22034,"siva@gmail.com",234567790,"hyd");
		EmployeeAssin2 emp2=new EmployeeAssin2("ranjith",22038,"ranjith@gmail.com",254567890,"sangareedy");
		EmployeeAssin2 emp3=new EmployeeAssin2("chandhu",22039,"chandhu@gmail.com",234567890,"Blaari");
		LinkedList ll=new LinkedList();
		ll.add(emp);
		ll.add(emp1);
		ll.add(emp2);
		ll.add(emp3);
		
		System.out.println(ll);
	System.out.println("using antoher type object iterator ");
		Iterator lm=ll.iterator();
		while(lm.hasNext()){
			System.out.println(lm.next());
		}
		System.out.println("using get index position");
		System.out.println(ll.get(0));
	}

}
