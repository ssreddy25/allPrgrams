// Let's see an example to print a custom message on exception
package javafundamentls;

public class Try_CatuchBlock3 {

	public static void main(String[] args) {
		try {
			int data=100/0;
		}catch(ArithmeticException e) {
			System.out.println("we can not divided by zero");
		}
		

	}

}
