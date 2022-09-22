package factoorial;

import java.util.Scanner;

public class FactUsingWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		long number=sc.nextLong();
		int i=1;
		long fact=1;
		while(i<=number) {
			fact*=i;
		     ++i;
		}
		System.out.println(number+" factoril is :"+fact);
		

	}

}
