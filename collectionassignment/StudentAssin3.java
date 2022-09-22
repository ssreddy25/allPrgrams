package collectionassignment;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @author ojas
 *
 *3). Write a program to group the student objects in ArrayList and   perform the
 *          operations to retrieving all objects using iterator ? 
 *
 */
public class StudentAssin3 {
	public String sName;
	public int sId;
	public String bloodG;
	
	

	public StudentAssin3(String sName, int sId, String bloodG) {
	
		this.sName = sName;
		this.sId = sId;
		this.bloodG = bloodG;
	}



	@Override
	public String toString() {
		return "StudentAssin3 [sName=" + sName + ", sId=" + sId + ", bloodG=" + bloodG + "]";
	}



	public static void main(String[] args) {
		StudentAssin3 student1=new StudentAssin3("siva",22034,"B+ve");
		StudentAssin3 student2=new StudentAssin3("siva sankar reddy",22035,"A+ve");
		StudentAssin3 student3=new StudentAssin3("Reddy",22038,"O+ve");
		StudentAssin3 student4=new StudentAssin3("siva sankar",22037,"O-ve");
		StudentAssin3 student5=new StudentAssin3("siva",22034,"B+ve");
		
		ArrayList al=new ArrayList();
		al.add(student1);
		al.add(student2);
		al.add(student3);
		al.add(student4);
		al.add(student5);
		 
		Iterator it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
