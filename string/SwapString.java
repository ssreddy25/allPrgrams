package string;

import java.util.Scanner;

public class SwapString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the one String");
		String s1=sc.next();
		System.out.println("enter the onther String");
		String s2=sc.next();
		System.out.println("be fore swap the string ");
		System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
		System.out.println(" after swap the string ");
		s1=s1+s2;
		 s2 = s1.substring(0, s1.length() - s2.length());

	     s1 = s1.substring(s2.length());
		System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
	}
}
