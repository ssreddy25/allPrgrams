package exceptionhandlinass1;

import java.util.Scanner;

/**
 * 
 * @author ojas
 *
 * Program which accepts string from user.
 *  If string contains word "India", raisean exception.
 *
 */
class India extends RuntimeException{
	India(String msg){
		super(msg);
	}
}
public class Assign8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the any STRING type of the data");
		String str=sc.nextLine();
	    String str1=str.toLowerCase();
	    System.out.println(str1);
		if(str1.contains("india")){
			throw new India("India is given String");
		}
		else{
			System.out.println("india is not thire in given string");
		}

	}

}
