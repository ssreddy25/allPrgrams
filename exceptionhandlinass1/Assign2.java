package exceptionhandlinass1;

/** 
 * 
 * 
 * 2. Write class Student with attributes roll no, name, age and course. 
       Initializevalues through parameterized constructor. 
 *     If age of student is not in between15 and 21 then generate user defined exception
 *     "Age Not within Range".Ifname contains numbers or special symbols,
 *      raise exception "Name not Valid".
 * 
 * 
 * 
 */
import java.util.Scanner;

class YoungBoy extends RuntimeException {
	YoungBoy(String msg) {
		super(msg);
	}
}
class WrongName extends RuntimeException {
	WrongName(String msg){
		super(msg);
	}
}

public class Assign2 {
	int rollNo;
	String name;
	int age;
	String course;

	public Assign2(int rollNo, String name, int age, String course) {

		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		this.course = course;
	}

	public void age1(int age) {

		if (age >= 15&&age >=21) {
			throw new YoungBoy("Age Not within Range :"+age);
		}
		 else {
				System.out.println("your age  is correct  :"+ age);
			}

	}

	public void name1(String name) {

		boolean result = name.matches("[a-zA-Z]+");
		if (result == false) {
			throw new WrongName("Name not Valid  :"+ name);
		} else {
			System.out.println("your name is valid  :"+ name);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("enter your details");
		System.out.println("enter your roll number");
		int rollNo = sc.nextInt();
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter your age betwwn 15 to 21");
		int age = sc.nextInt();
		System.out.println("enter your course");
		String course = sc.next();
		Assign2 student = new Assign2(rollNo, name, age, course);
		System.out.println(student.rollNo);
		try {
			student.age1(age);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			student.name1(name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(student.rollNo);
	    System.out.println(student.course);
		
		}
	}

}
