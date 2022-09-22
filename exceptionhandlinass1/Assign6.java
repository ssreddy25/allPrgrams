package exceptionhandlinass1;


import java.util.Scanner;

/**
 * 
 * @author ojas
 *
 *         6. Class ExceptionDemo throws following exception depending upon
 *         followingcondition: Take any integer from the keyboard. If the
 *         integer is between 0 and 5, exception of type "Small Number"is
 *         thrown. If the number is between 5 and 10,"Proper Number" is thrown.
 *         If the number is greater than 10,"Greater Number" is thrown. Also
 *         find the factorial of that number(using static keyword).
 *
 *
 */
class SmallNo extends RuntimeException{
	public SmallNo(String msg){
		super(msg);
	}
	
}
class ProperNo extends RuntimeException{
	public ProperNo(String msg){
		super(msg);
	}
	
}
class GreaterNo extends RuntimeException{
	public GreaterNo(String msg){
		super(msg);
	}
	
}
public class Assign6 {
	public static int fact1=1;
	
	public static void  fact(int num){
		for(int i=1;i<=num;++i){
			fact1=fact1*i;
		}
		System.out.println("factorial of the given the number :"+fact1);
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the integer numbers");
		int num=sc.nextInt();
		if(num>=0&&num<=5){
			try {
				throw new SmallNo("Small Number");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(num>=5&&num<=10){
			try {
				throw new ProperNo("Proper Number");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if(num>=10){
			try {
				throw new GreaterNo("Greater Number");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("enter the positve numbers only");
		}
		
	      fact(num);
	     
	}

}
