package collectionassignment;

/**
 * 
 * 4). Write a program to group the student objects in ArrayList and 
 * perform the operations to retrieving student objects from a specified index  
 * and provide appropriate exception handling if  the  given index not present ? 
 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentAssig4 {

	public String sName;
	public int sId;
	public String bloodG;

	public StudentAssig4(String sName, int sId, String bloodG) {

		this.sName = sName;
		this.sId = sId;
		this.bloodG = bloodG;
	}

	@Override
	public String toString() {
		return "StudentAssin3 [sName=" + sName + ", sId=" + sId + ", bloodG=" + bloodG + "]";
	}

	public static void main(String[] args) {
		StudentAssig4 student1 = new StudentAssig4("siva", 22034, "B+ve");
		StudentAssig4 student2 = new StudentAssig4("siva sankar reddy", 22035, "A+ve");
		StudentAssig4 student3 = new StudentAssig4("Reddy", 22038, "O+ve");
		StudentAssig4 student4 = new StudentAssig4("siva sankar", 22037, "O-ve");
		StudentAssig4 student5 = new StudentAssig4("siva", 22034, "B+ve");

		ArrayList al = new ArrayList();
		al.add(student1);
		al.add(student2);
		al.add(student3);
		al.add(student4);
		al.add(student5);

		Iterator it = al.iterator();

		while (it.hasNext()) {
				System.out.println(it.next());
			}
			System.out.println("using get index position");
			System.out.println(al.get(0));

			Scanner sc = new Scanner(System.in);
			System.out.println("enter the position of the object get the detils paticular object");
			try {
				System.out.println(al.get(sc.nextInt()));
			} catch (Exception e) {
				System.out.println("your object is not avilable in the position");
			}

		}

	}


