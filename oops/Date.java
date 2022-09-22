package oops;

import java.util.Scanner;

class DateBluePrint{
	int date;
	int month;
	int year;
	public DateBluePrint(int date, int month, int year) {
		if((date>=1&&date<=31)&&(month>=1&&month<=12)&&(year>=1900&&year<=9999)){
		this.date = date;
		this.month = month;
		this.year = year;
		}else{
			System.out.println("enter the write all date and month ,year");
		}
	}
	@Override
	public String toString() {
		return "DateBluePrint [date=" + date + ", month=" + month + ", year=" + year + "]";
	}
	
	
}

public class Date {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date");
		int date=sc.nextInt();
		System.out.println("enter the month");
		int month=sc.nextInt();
		System.out.println("enter the year");
		int year=sc.nextInt();
		DateBluePrint dateBluePrint=new DateBluePrint(date, month, year);
		System.out.println(dateBluePrint);

	}

}
