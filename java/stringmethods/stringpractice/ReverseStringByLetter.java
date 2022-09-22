package stringpractice;

import java.util.Scanner;

public class ReverseStringByLetter {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the string");
		
		String str=s.next();
		
		for(int i=str.length()-1;i>=0;i--){
		
		System.out.print(str.charAt(i));}
		
		
		                 //using toCharArray
		
		System.out.println("---------------------");
		
		char[] array=str.toCharArray();
		
		for(int j=array.length-1;j>=0;j--){
			
			System.out.print(array[j]);
		}
		
		                    //using string buffer
		
		System.out.println("-------------------------");
		
		StringBuffer sb=new StringBuffer("good");
		
		System.out.println(sb.reverse());
		
	}

}
