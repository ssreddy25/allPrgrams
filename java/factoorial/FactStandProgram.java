package factoorial;

import java.util.Scanner;

public class FactStandProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		 long fact=1;
		for(int i=1;i<=number;++i) {
			fact*=i;
		}
		System.out.println(number+" factroial is a: "+fact);

	}

}
