package exceptionhandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("frist line");
		System.out.println("second line");
	    try {
			System.out.println(10/0);
		} catch (Exception e) {
			try {
				System.out.println(20/0);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
			e.printStackTrace();
		}
	    finally{
	    	System.out.println("from finally");
	    }
		System.out.println("last line ");

	}

}
