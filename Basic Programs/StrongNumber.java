package task;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  postive integer");
		int n=sc.nextInt();
		int add=0,temp=n,rem;
		while(n>0) {
			rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			add=add+fact;
			n=n/10;
			
		}
		if(temp==add) {
			System.out.println(temp+" is strong number");
		}
		else {
			System.out.println(temp+" is not strong number");
		}

	}

}
