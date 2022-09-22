package exceptionhandling;

import java.util.Scanner;

class AppliedVote extends RuntimeException{
	 AppliedVote(String kohili){
		 super(kohili);
	 }
}
class  NotEligible extends RuntimeException{
	 NotEligible(String kohili){
		 super(kohili);
	 }
}
public class Demo12 {
	
	public static void display() throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException{
		System.out.println("method throws ");
		try {
			System.out.println(30/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("siva");
	}

	public static void main(String[] args) {
		//int s=10.0f;
		int[] arr={10,20,30,40};
		String s=null;
		try {
			System.out.println(s.length());
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			System.out.println(arr[8]);
			try {
				System.out.println(56/0);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		System.out.println("frist line");
		try{
			System.out.println(20/0);
		}
		catch(ArithmeticException e){
			//System.out.println(shank);
			//e.printStackTrace();
			System.out.println(e.getClass().getName());
			
		}
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("mihtra");
		}
		System.out.println("last line");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if(age>=18){
			try {
				throw new AppliedVote("your eligilble for vote in this election");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(age<=18)
			try {
				throw new NotEligible("your  not eligilble  for vote in this election");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		display();
		
		System.out.println("end method");
		
	}
	

}
