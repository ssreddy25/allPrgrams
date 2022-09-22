package stringpractice;

public class isDigitMethod {

	public static void main(String[] args) {
		
		String str="9273635";
		
		int count=0;

	    for(int i=0;i<str.length();i++){
	    	
	    	char ch=str.charAt(i);
	    
	    	if(Character.isDigit(ch)){
	    		count++;
	    	}
	    	
	    }
	    if(count==0){
	    	System.out.println("given string contains characters also");
	    }
	    else
	    	System.out.println("given string contains only digits");
	}

}
