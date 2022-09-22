package oops;

import java.util.Scanner;

public class TestCricle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radiues of the cricle");
		double radiues=sc.nextDouble();
		Cricle cricle=new Cricle();
		cricle.setRadiues(radiues);
		System.out.println("cricle ot the radiues is: "+cricle.getRadiues());
		System.out.println("area of cricle is:"+cricle.getAera()+"  and area of cricumtance is :"+cricle.getCircum());
		
		cricle.setRadiues(25.0);
		System.out.println("cricle ot the radiues is: "+cricle.getRadiues());
		System.out.println("area of cricle is:"+cricle.getAera()+"  and area of cricumtance is :"+cricle.getCircum());
		
		
	}

}
