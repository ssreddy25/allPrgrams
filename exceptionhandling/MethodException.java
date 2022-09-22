package exceptionhandling;

import java.rmi.AccessException;

public class MethodException {
	public void disply() throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException{
		System.out.println("methodexception");
		System.out.println(20/0);
		System.out.println("methodexception2");
	}
	public void display2()throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException{
		int [] arr={20,40,50,78};
		System.out.println(arr[2]);
		System.out.println(arr[8]);
	}
	public void display3()throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException{
		String s=null;
		System.out.println(s.length());
	}

	public static void main(String[] args) {
		
		MethodException methodException=new MethodException();
		
			try {
				methodException.disply();
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("siva sankar reddy");
			try {
				methodException.display2();
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				methodException.display3();
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ArithmeticException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

}
