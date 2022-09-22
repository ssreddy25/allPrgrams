package task;
import java.util.*;
public class SumOfFactors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a postive integer");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i+" sum of factros "+n);
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
	}

}
