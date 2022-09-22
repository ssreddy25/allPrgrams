package task;
import java.util.*;
public class Polyndriome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a postive integer");
		int n=sc.nextInt();
		int rem,reverse=0,tem=n;
		while(n>0){
			rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		if(tem==reverse) {
			System.out.println(tem+" is polyndrome number: ");
		}
		else {
			System.out.println(tem+" is not polyndrome number: ");
		}
			

	}

}
