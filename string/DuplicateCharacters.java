package string;

import java.util.Scanner;

public class DuplicateCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String string=sc.next();
	    char[] str=string.toCharArray();
	    int count;
	    for(int i=0;i<str.length;++i){
	    	count=1;
	    	for(int j=i+1;j<str.length;++j){
	    		if(str[i]==str[j]&&str[i]!=' '){
	    			count++;
	    			str[j]='0';
	    		}
	    	}
	    	if(count>1 &&str[i] !='0'){
	    		 System.out.println(str[i]+"="+count);
	    	}
	    }
	}

}
