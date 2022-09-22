package stringpractice;

import java.util.Scanner;

public class CountVowelsAndConsonents {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int count1=0,count2=0;
		
		System.out.println("enter the string");
		String str=s.next();
		
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
				count1++;
			}
			else
				count2++;
		}
		System.out.println("vowels count:"+count1);
		System.out.println("consonents count:"+count2);

	}

}
