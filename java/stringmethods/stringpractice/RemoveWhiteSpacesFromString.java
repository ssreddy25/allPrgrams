package stringpractice;

/**
 * program to remove white spaces present in a string
 * @author sp22082
 *
 */

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		
		String str1="hello welcome to java";
		
		String str2=str1.replaceAll(" ", "");
		System.out.println(str2);
		
		
	}
	
}
