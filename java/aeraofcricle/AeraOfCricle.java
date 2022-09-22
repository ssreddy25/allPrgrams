package aeraofcricle;
/**
 * wap area of cricle
 */

import java.util.Scanner;

public class AeraOfCricle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		double radius=sc.nextDouble();
		double area=(22*radius*radius)/7;
		System.out.println("area of cricle is "+area);

	}

}
