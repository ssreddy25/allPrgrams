//Let's see the solution of the above problem by a java try-catch block.
package javafundamentls;


public class Try_CatuchBlock {

	public static void main(String[] args) {
		try {
			int data=100/0;
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("rest of the code");

	}

}
