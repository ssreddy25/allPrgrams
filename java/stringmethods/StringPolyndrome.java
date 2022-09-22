package stringmethods;

import java.util.Scanner;

public class StringPolyndrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  Palindrome string name ");
		String poly=sc.next();

		String reverseStr = "";

		int strLength = poly.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + poly.charAt(i);
		}

		if (poly.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(poly + " is a Palindrome String.");
		} else {
			System.out.println(poly + " is not a Palindrome String.");
		}

	}

}
