package stringpractice;

import java.util.Scanner;

public class CharactersOrDigits {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 int count1=0,count2=0;
		 
		 System.out.println("enter the string:");
		 String str=s.next();
		 for(int i=0;i<str.length();i++){
			 
			 char ch=str.charAt(i);
			 
			 if(Character.isAlphabetic(ch)){
				 count1=1;
			 }
			 else {
				 count2=1;
			 }
		 }
		 if(count1==1&&count2==1){
			 System.out.println("given string contains  both characters and digits");
		 }
		 else if(count2==1)
			 System.out.println("given string contains only digits");
		 else
			 System.out.println("given string contains only characters");

	}

}
