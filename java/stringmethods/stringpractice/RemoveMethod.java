package stringpractice;

import java.util.Scanner;

public class RemoveMethod {

	public static void main(String[] args) {
		String str="hello java";
		Scanner s=new Scanner(System.in);
		System.out.println("enter the index number");
		int num=s.nextInt();
		
		for(int i=0;i<str.length();i++){
			char ch =str.charAt(num);
//			if(str.charAt(i)=='j'){
//				System.out.println(str.replace("j", ""));
//			}
			
			if(str.charAt(num)==ch){
				String s1=Character.toString(ch);
				System.out.println(str.replace(s1, ""));
				break;
			}
		}
		

	}

}
