package exceptionhandling;

public class MultipleCatch {

	public static void main(String[] args) {
		int a=50;
		int c=50;
		System.out.println(a);
		try {
			System.out.println(30/0);
			
		}catch(ArithmeticException e){
			System.out.println(e);
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c);
	}

}
