package aeraofcricle;

import java.util.Scanner;

public class AeraOfEquilateralTrangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side of the triangle");
		double side=sc.nextDouble();
		double area=(Math.sqrt(3)/4)*(side*side);
		System.out.println("aera of triangle is:"+area);

	}

}
