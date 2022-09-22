package exceptionhandlinass1;

import java.util.Scanner;

/**
 * 
 * @author ojas
 *
 *         7. Class ExceptionDemo throws the following exception depending upon
 *         the following conditions. Take any string from the keyboard. If
 *         string length is between 0 and 5, then Exception "too small string"is
 *         thrown.If string length is between 5 and 10, then exception to type
 *         "PerfectString" is thrown.
 *
 *
 *
 */
class SmallString extends RuntimeException{
	SmallString(String msg){
		super(msg);
	}
}
class PerfectString extends RuntimeException{
	PerfectString(String msg){
		super(msg);
	}
}
public class Assign7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the any STRING type of the data");
		String str=sc.next();
		int len=str.length();
		System.out.println(len);
		if(len>=0&&len<=5){
			throw new SmallString("too small string");
		}
		else if(len>=5&&len<=10){
			throw new PerfectString("PerfectString");
		}

	}

}
