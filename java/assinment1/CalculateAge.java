package assinment1;

import java.util.Scanner;

public class CalculateAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the your birth year");
		int birthYear=sc.nextInt();
		System.out.println("enter the your birth month");
		int birthMonth=sc.nextInt();
		System.out.println(calculateAge(birthYear,birthMonth));
		

	}
	public static double calculateAge(double birthYear ,double birthMonth) {
		double curentAge=2022-birthYear;
		double age=((12*curentAge+birthMonth)/12);
		
		if(0>=birthMonth || birthYear<=0 ) {
			
			return -1;
		}
      if(birthMonth>=6  && birthYear>=2022) {
			
			return -2;
		}
		return age;
		
	}

}
