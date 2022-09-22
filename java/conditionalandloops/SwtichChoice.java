package conditionalandloops;

import java.util.Scanner;

/**
 * 
 * @author su22034 wap choice of the menu
 */
public class SwtichChoice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("|***********************|");
		System.out.println("| 1.pizza               |");
		System.out.println("| 2.egg puf             |");
		System.out.println("| 3.chiken pizz         |");
		System.out.println("| 4.veg briyani         |");
		System.out.println("| 5.chicke briyani      |");
		System.out.println("| 6.mutton briyani      |");
		System.out.println("|***********************|");
		System.out.println("order your item");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("take your pizza");
			break;
		case 2:
			System.out.println("take your egg puf");
			break;
		case 3:
			System.out.println("take your chicken  pizza");
			break;
		case 4:
			System.out.println("take your veg briyani");
			break;
		case 5:
			System.out.println("take your chicken briyani");
			break;
		case 6:
			System.out.println("take your mutton briyani");
			break;
		default:
			System.out.println("choose items  1 to 6 only");

		}

	}

}
