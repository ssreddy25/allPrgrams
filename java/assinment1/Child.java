package assinment1;
class Parent{
	String name;
	public Parent() {
		System.out.println("from parent default con");
	}
    public Parent(int x) {
    this();	
	System.out.println("from  parent pramter con");
	}
	public void sleep() {
		System.out.println("from  parent sleep method");
	}
	public void run() {
		System.out.println("from parent run mthod");
	}
}
public class Child extends Parent {
	String fname;
	public Child() {
		System.out.println("from default child con");
	}
    public Child(int x) {
    	super(10);
		System.out.println("from parmete child con");
	}
	public void stydy() {
		System.out.println("from  child study method");
	}
	public void talk() {
		System.out.println("from chlid talk mthod");
	}
	

	public static void main(String[] args) {
		Child child=new Child(25);
		System.out.println(child);
		System.out.println(child.name);
		child.name="prethi";
		System.out.println(child.name);
	}

}
