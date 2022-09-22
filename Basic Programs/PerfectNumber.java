package task;

import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a postive integer");
		int n=sc.nextInt();
		int perfet=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				perfet+=i;
			}
		}
		if(n==perfet) {
			System.out.println(n+" is perfect number");
		}
		else {
			System.out.println(n+" is not perfect number");
		}
	}

}
