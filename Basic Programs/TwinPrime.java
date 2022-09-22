package task;
import java.util.*;
public class TwinPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min postive integer");
		int n=sc.nextInt();
		System.out.println("enter max postive integer");
		int m=sc.nextInt();
		if(n+2==m) {
			System.out.println("("+n+","+m+")"+ "is a twin prime number ");
		}
		else {
			System.out.println("("+n+","+m+")"+"is a not  twin prime number ");
		}

	}

}
