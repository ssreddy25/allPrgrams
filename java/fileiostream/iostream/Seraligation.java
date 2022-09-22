package iostream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	public int eId;
	public String eFristName;
	public String eLastName;
	public double eSalary;
	public Employee(int eId, String eFristName, String eLastName, double eSalary) {
		super();
		this.eId = eId;
		this.eFristName = eFristName;
		this.eLastName = eLastName;
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eFristName=" + eFristName + ", eLastName=" + eLastName + ", eSalary="
				+ eSalary + "]";
	}
	
}
public class Seraligation{
	public void seralizationMethod(Object obj){
		try {
			FileOutputStream fos=new FileOutputStream("student.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(obj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("seralization completed");
	}
	
	public Object deSerilizationMethod(){
		Object obj=null;
		try {
			FileInputStream fis=new FileInputStream("student.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			obj=ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
		
	}
	public static void main(String[] args)  throws IOException{
		
		Seraligation seraligation=new Seraligation();
		
		Employee employee=new Employee(111,"siva","uppaluru",50000.0);
		
		seraligation.seralizationMethod(employee);
		Employee  emp=(Employee) seraligation.deSerilizationMethod();
		System.out.println(emp);
		

	}

}
