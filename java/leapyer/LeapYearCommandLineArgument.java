package leapyer;

public class LeapYearCommandLineArgument {

	public static void main(String[] args) {
		long year=Integer.parseInt(args[0]);
		if(year!=0) {
			if(year%400==0) {
				System.out.println(year+" is leap year");
			
			}
			else if(year%100==0) {
				System.out.println(year+" is not leap year");
			}else if(year%4==0) {
				System.out.println(year+" is leap year");
			}
		    else {
			System.out.println(year+" is not leap year");
		}
	}
		else {
			System.out.println(year+" is not exsit");
		}

	}

}
