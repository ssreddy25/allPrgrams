package stringmethods;

public class StringLengthMethod {

	public static void main(String[] args) {
		String length="ssreddy";
		//string lenth method
		int len=length.length();
		System.out.println(len);
		//string concat method
		String str1="ojas";
		String str2="invetion technology";
		System.out.println(str1.concat(str2));
		//string charAt() method;
		System.out.println(str1.charAt(2));
		//string convert tocharArray
		char[] chars=str2.toCharArray();
		System.out.println(chars);
		for(char newchars:chars) {
			System.out.println(newchars);
		}
		//string contains method it returns true /false
		 String str3="tech";
		 System.out.println(str2.contains(str3));
		 //touppercase method
		 System.out.println(str2.toUpperCase());
		 //lowercase method
		 System.out.println(str3.toLowerCase());
		 //index met
		 System.out.println(str2.indexOf('c'));
		 //substring method 
		 System.out.println(str2.substring(5, 13));
		 //trim method remove white space  fornt and back but not removed the middle
		 String str4="   siva sankr reddy uppalure           ";
		 System.out.println(str4);
		 System.out.println(str4.trim());
		 //compare to ignorecase
		 String str5="sivasankar reddy uppaluru";
		 String str6="SIVA SANKAR REDDY UPPALURU";
		  int result=str5.compareToIgnoreCase(str6);
		  System.out.println(result);
		  //replace metod
		  System.out.println("before replace method");
		  System.out.println(str5);
		  System.out.println("after replace method");
		  System.out.println(str5.replace('a', 'h'));
          //isEmpty() mehod is a and blank method
		  System.out.println(str5.isEmpty());
		  System.out.println(str5.isBlank());
		  //public int codePointAt(int index) this is teturn the charter ANSI vlue of charater 
		  System.out.println(str5.codePointAt(0));
          //public int codePointBefore(int index) 
		  System.out.println(str5.codePointBefore(4));
		  //public int codePointCount(int beginIndex,int endIndex)
		   System.out.println(str5.codePointCount(0,9));
	}

}
