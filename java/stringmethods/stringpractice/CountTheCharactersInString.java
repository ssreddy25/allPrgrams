package stringpractice;

import java.util.Scanner;

public class CountTheCharactersInString {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the string");
		String str=s.nextLine();
		
		char[] array=str.toCharArray();
		
		for(int i=0;i<array.length;i++){
			int count=1;
			for(int j=i+1;j<array.length;j++){
				 if(array[i]==array[j]){
					 count++;
					 array[j]='0';
				 }
				
				 }
			 if(count>0){
				 System.out.println(array[i]+" "+count);
			}
		}

	}

}
