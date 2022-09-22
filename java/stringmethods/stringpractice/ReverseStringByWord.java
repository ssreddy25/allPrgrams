package stringpractice;

public class ReverseStringByWord {

	public static void main(String[] args) {
		
		String str="java is an object oriented programming language.";
		
		String[] words=str.split(" ");
		
		for(int i=words.length-1;i>=0;i--){
			
			System.out.println(words[i]);
			
		}

	}

}
