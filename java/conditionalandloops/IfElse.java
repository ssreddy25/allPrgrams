
/**
 * 
 * @author su22034
 * wap to print even number or not
**/
package conditionalandloops;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println(number+" is even number.");
		}
		else {
			System.out.println(number+" is not even number.");
		}

	}

}
