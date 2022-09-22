package stringpractice;

public class PallindromeString {

	public static void main(String[] args) {
		
		String str1="hi";
		
		int count=0;
		
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=str1.charAt(str1.length()-i-1)){
				
				count++;
			}
		}
		if(count==0){
			System.out.println("given string is  a pallindrome");
		}
		else
			System.out.println("given string is not a pallindrome");

	}

}
