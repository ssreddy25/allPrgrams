package leapyer;

import java.util.Scanner;

public class LeapyearUsingTenerayOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  the  any year");
		long a,c;
		long year=sc.nextInt();
		if(year!=0) {
			a=(year%400==0)?(c=1):((year%100==0)?(c=0):((year%4==0)?(c=1):(c=0)));
			if(a==1) {
				System.out.println(year+" is leap year");
			}else {
				System.out.println(year+" is not leap year");
			}
			
		}
		else {
			System.out.println(year+" year does not exsit");
		}

	}

}
