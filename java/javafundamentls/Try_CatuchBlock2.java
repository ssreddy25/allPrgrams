//In this example, we also kept the code in a try block that will not throw an exception.


package javafundamentls;

public class Try_CatuchBlock2 {

	public static void main(String[] args) {
		try {
			int data=100/0;//throws exption here
			System.out.println("rest of the code");
		}catch(Exception e) {
			System.out.println(e);
		}
		


	}

}
