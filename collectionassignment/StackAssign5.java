package collectionassignment;

import java.util.Scanner;
import java.util.Stack;

/**
 * 
 * @author ojas
 *
 *         5).Write a program to accept courses from user and push into the
 *         stack and remove the given course from Stack.
 *
 */
public class StackAssign5 {

	public static void main(String[] args) {
		Stack s = new Stack();

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("    STACK OPERATION");
			System.out.println("*********************");
			System.out.println("   1.POP        ");
			System.out.println("   2.push        ");
			System.out.println("   3.peek        ");
			System.out.println("   4.print in Stack course       ");
			System.out.println("   5.exist       ");
			System.out.println("*********************");
			System.out.println("enter the your choice");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				s.pop();
				break;
			case 2:
				System.out.println("enter the your COURSE");
				s.push(sc.next());
				break;
			case 3:
				s.peek();
				break;
			case 4:
				System.out.println(s);
				break;
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("select 1-5 numbers only");
			}

		}
	}
}
