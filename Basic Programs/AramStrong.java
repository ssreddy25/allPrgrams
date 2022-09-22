package task;
import java.util.*;
public class AramStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a postive integer");
		int n=sc.nextInt();
		int rem,arm=0,tem=n;
		while(n>0) {
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		if(tem==arm) {
			System.out.println(tem+" is armstrong number");
		}
		else {
			System.out.println(tem+" is not armstrong number");
		}

	}

}
