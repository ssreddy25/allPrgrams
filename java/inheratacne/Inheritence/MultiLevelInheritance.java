package Inheritence;
/**
 * if a child class is extending a parent class and another child class extends the child class then it is called multi level inheritence.
 * @author Ojas
 *
 */

class College{
	public void parentMethod(){
		System.out.println("method of the parent class");
	}
}
class Course extends College{                       //child class extends parent class
	public void childMethod(){
		System.out.println("method of the child class");
	}
}
public class MultiLevelInheritance extends Course {              //another child class that extends child class

	public void method(){
		System.out.println("method of the child class that extends another child class");
	}
	public static void main(String[] args) {
		MultiLevelInheritance obj=new MultiLevelInheritance();
		obj.parentMethod();
		obj.childMethod();
		obj.method();

	}

}
