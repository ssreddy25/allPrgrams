package stringpractice;

import java.util.Scanner;

public class CountDuplicateWordsInString {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int i;
		
		System.out.println("enter the string:");
		String str=s.nextLine();
        	
		String[] words=str.split(" ");
		
		for( i=0;i<words.length;i++){
			int count=1;
			for( int j=i+1;j<words.length;j++){
				if(words[i].equals(words[j])){
					count++;
					 words[j] = "0";    
				}
				
			}
			if(count>1&&words[i]!="0"){
				System.out.println(words[i]+" "+count);
			
		}
		
		
		}
	}

}
