package leapyer;

import java.util.Scanner;

public class LeapyearUsingStaticMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		long year=sc.nextLong();
		leapYear(year);
		

	}
	public static void leapYear(long year) {
		if(year!=0) {
			if(year%400==0) {
				System.out.println(year+" is leap year");
			
			}
			else if(year%100==0) {
				System.out.println(year+" is not leap year");
			}else if(year%4==0) {
				System.out.println(year+" is leap year");
			}
		    else {
			System.out.println(year+" is not leap year");
		}
	}
		else {
			System.out.println(year+" is not exsit");
		}
	}


}
