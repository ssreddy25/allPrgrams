package assignment8;

import java.util.Scanner;

public class BusinessAdvertisment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
			System.out.println("choose the your Advertisment         ");
			System.out.println("  1.MatrimonialAdvertisment          ");
			System.out.println("  2.RealEstateAdvertisment           ");
			System.out.println("  3.EXIST                            ");
			System.out.println("❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️❤️");
			System.out.println("enter the your advertisment");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter the your advertismentid ");
				String id = sc.next();
				System.out.println("enter the adDescriptionS here");
				String asD = sc.next();
				System.out.println("enter the your gender");
				String gender = sc.next();
				System.out.println("enter your age");
				int age = sc.nextInt();
				System.out.println("enter your occupation");
				String occ = sc.next();
				MatrimonialAdvertisment matrimonialAdvertisment = new MatrimonialAdvertisment(id, asD, gender, age,
						occ);
				System.out.println(matrimonialAdvertisment);
				System.out.println("❤️❤️❤️❤️❤️ thanks you visit agin❤️❤️❤️❤️❤️❤️❤️");
				break;
			case 2:
				System.out.println("enter the your advertismentid ");
				String id1 = sc.next();
				System.out.println("enter the adDescriptionS here");
				String asD1 = sc.next();
				System.out.println("enter the your realEstateType");
				String rET = sc.next();
				System.out.println("enter your property in cents");
				String size = sc.next();
				System.out.println("enter your property price  ");
				double price = sc.nextDouble();
				RealEstateAdvertisment realEstateAdvertisment = new RealEstateAdvertisment(id1, asD1, rET, size, price);
				System.out.println(realEstateAdvertisment);
				System.out.println("❤️❤️❤️❤️❤️ thanks you visit agin❤️❤️❤️❤️❤️❤️❤️");
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("enter the 1 to 3 only");

			}
		}
	}
}
