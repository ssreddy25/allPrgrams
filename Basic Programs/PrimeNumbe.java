package task;
import java.util.*;
public class PrimeNumbe {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a postive integer");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(n+" is prime number");
		}
		else {
			System.out.println(n+" is not prime number");
		}

	}

}
