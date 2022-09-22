package exceptionhandlinass1;

/**
 * 
 * @author ojas
 *
 *9. Write a Java program to find sum of integer from command line argument
 * andcount invalid integers through command line(Use Exception Handling).
 *
 *
 */
public class Assign9 {

	public static void main(String[] args) {
		int count=0,sum=0;
		try {
			int n1=Integer.parseInt(args[0]);
			sum=sum+n1;
		} catch (NumberFormatException e) {
			count++;
			e.printStackTrace();
		}
		try {
			int n2=Integer.parseInt(args[1]);
			sum=sum+n2;
		} catch (NumberFormatException e) {
			count++;
			e.printStackTrace();
		}
		try {
			int n3=Integer.parseInt(args[2]);
			sum=sum+n3;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			int n4=Integer.parseInt(args[3]);
			sum=sum+n4;
		} catch (NumberFormatException e) {
			count++;
			e.printStackTrace();
		}
		try {
			int n5=Integer.parseInt(args[4]);
			sum=sum+n5;
		} catch (NumberFormatException e) {
			count++;
			e.printStackTrace();
		}
		try {
			int n6=Integer.parseInt(args[5]);
			sum=sum+n6;
		} catch (NumberFormatException e) {
			count++;
			e.printStackTrace();
		}
		System.out.println("sum of the integers :"+sum);
		System.out.println("count of the worng integers :"+count);
		
	}

}
