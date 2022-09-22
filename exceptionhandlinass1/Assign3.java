package exceptionhandlinass1;

import java.util.Scanner;

/**
 * 
 * @author ojas
 *
 *3. Write a Java Program to find the exception Marks Out of Bounds.
 * Create aclass Student. If mark is greater than 100,
 * it must generate user definedexception called Mark Out of Bounds Exception and throw it.
 *
 *
 *
 */
class  MarksError extends RuntimeException{
	MarksError(String msg){
		super(msg);
	}
}
public class Assign3 {
	int rollNo;
	String name;
	int age;
	String course;
	int marks;
	

	public Assign3(int rollNo, String name, int age,String course,int marks) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
		
		this.course = course;
		this.marks = marks;
	}
	public void marks1(int mark){
		if(mark>=100){
			throw new MarksError(" Mark Out of Bounds Exception "+mark+"/"+"100");
		}
		else{
			System.out.println(mark+"/"+"100");
		}
		
	}


	@Override
	public String toString() {
		return "Assign3 [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course + ", marks="
				+ marks + "]";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter student  details");
		System.out.println("enter your roll number");
		int rollNo = sc.nextInt();
		System.out.println("enter your name");
		String name = sc.next();
		System.out.println("enter your age ");
		int age = sc.nextInt();
		System.out.println("enter your course");
		String course = sc.next();
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		Assign3 student=new Assign3(rollNo, name, age, course,marks);
		student.marks1(marks);
		System.out.println(student);
		
		
		
	}

}
