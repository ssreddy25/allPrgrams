package Inheritence;
/**
 * when a single child extends a single parent class then it is called single level inheritence.
 * @author Ojas
 *
 */

class Parent{
	public void parentMethod(){
		System.out.println("method of the parent class");
	}
}
public class SingleLevelInheritence extends Parent{                  //here the single inheritance class is extending the parent class

	public void childMethod(){
		System.out.println("method of the child class");
	}
	public static void main(String[] args) {
		SingleLevelInheritence sli=new SingleLevelInheritence();
		
		sli.parentMethod();
		sli.childMethod();

	}

}
