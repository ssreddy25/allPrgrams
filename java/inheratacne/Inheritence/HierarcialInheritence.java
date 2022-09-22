package Inheritence;
/**
 * if the parent class is extended by multiple child classes then it is called hierarcial inheritance.
 * @author Ojas
 *
 */
class Animal{
	public void parentMethod(){
		System.out.println("method of the parent class");
	}
}
class Dog extends Animal{                                  //child1 extends the parent class
	public void child1Method(){
		System.out.println("method of the first child class");
	}
}
public class HierarcialInheritence extends Animal {                //child2 extends the parent class

	public void child2Method(){
		System.out.println("method of the second child class");
	}
	public static void main(String[] args) {
		
		HierarcialInheritence obj=new HierarcialInheritence();
		obj.parentMethod();
		
		obj.child2Method();
		
		//obj.child1Method();                         here we cannot call child1method as it is not extended by hierarcial class
	}

}
