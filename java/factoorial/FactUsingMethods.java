package factoorial;

import java.util.Scanner;

public class FactUsingMethods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		long number=sc.nextLong();
		FactUsingMethods factUsingMethods=new FactUsingMethods();
		long fact1=factUsingMethods.fact(number);
		System.out.println(number+"  factoral is a :"+fact1);

	}
	public long fact(long number) {
		 long fact=1;
		for(int i=1;i<=number;i++) {
			fact*=i;
		}
		return fact;
	}

}
