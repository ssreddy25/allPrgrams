package conditionalandloops;

import java.util.Scanner;

/**
 * 
 * @author su22034 wap to print largest number
 */
public class IfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a fris number, second number and theridnlumber");
		int fristnumber = sc.nextInt();
		int secondnumber = sc.nextInt();
		int thridnumber = sc.nextInt();
		if (fristnumber > secondnumber && fristnumber > thridnumber) {
			System.out.println(fristnumber + " is largest number");
		} else if (secondnumber > fristnumber && secondnumber > thridnumber) {
			System.out.println(secondnumber + " is largest number ");
		} else if (thridnumber > fristnumber && thridnumber > secondnumber) {
			System.out.println(thridnumber + " is largest number ");
		} else {
			System.out.println("one , two or three values or equal");
		}

	}

}
