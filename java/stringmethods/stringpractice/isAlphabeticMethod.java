package stringpractice;

public class isAlphabeticMethod {

	public static void main(String[] args) {
		
		String str="prevention is better than cure";
		int count=0;
		
		for(int i=0;i<str.length();i++){
			
			char ch=str.charAt(i);
			
			if(Character.isAlphabetic(ch)){
				
				count=1;
			}
		}
		if(count!=0){
			System.out.println("given string contains only characters");
		}
		else
			System.out.println("given string contains characters that are not alphabets");
	}

}
