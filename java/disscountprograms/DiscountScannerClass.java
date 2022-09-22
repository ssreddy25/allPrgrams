package disscountprograms;

import java.util.Scanner;

public class DiscountScannerClass {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the market price");
	
	double price=sc.nextDouble();
	System.out.println("enter the disscount percentage");
	double discount=sc.nextDouble();
	double s,amount;
	s=100-discount;
	amount=(s*price)/100;
	System.out.println("after discount :"+amount);

	}

}
