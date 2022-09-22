package aeraofcricle;

import java.util.Scanner;

public class AeraOfCricleUsingMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the radius");
		double radius = sc.nextDouble();
		double area = cricle(radius);
		System.out.println("area of cricle is  " + area);

	}

	public static double cricle(double radius) {
		
		return 22*radius*radius/7;
	}

}
