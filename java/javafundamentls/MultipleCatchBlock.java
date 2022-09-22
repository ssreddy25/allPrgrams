package javafundamentls;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//int a[] = new int[5];
			//a[5] = 30 / 0;
			
			  //int a[]=new int[5];    
              
             // System.out.println(a[10]);  
              
             // int a[]=new int[5];    
             // a[5]=30/0;   //frist get that exceptio gives  
              //System.out.println(a[10]);  
              //a[5]=30/0; 
              
              String s=null;  
              System.out.println(s.length());
              
		} catch (ArithmeticException e) {
			System.err.println("arithmeticException occurs");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("ArrayIndexOutOfBoundsException ");
		} catch (Exception e) {
			System.err.println(" parent exception "+e);
		}
		System.out.println("rest of the code");

	}

}
