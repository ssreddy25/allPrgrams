package task;
import java.util.*;
import java.util.Scanner;

public class ArmStrongRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min postive integer");
		int n=sc.nextInt();
		System.out.println("enter max postive integer");
		int m=sc.nextInt();
		for(int i=n;i<=m;i++) {
			int rem,arm=0,tem=i,tem1=i;
			while(tem>0) {
				rem=tem%10;
				arm=arm+(rem*rem*rem);
				tem=tem/10;
			}
			if(tem1==arm) {
				System.out.println(tem1);
			}
		}
	}

}
