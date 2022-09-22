package exceptionhandling;

import java.util.Scanner;
class IllegalArugumentException extends RuntimeException{
    IllegalArugumentException(String msg){
        super(msg);
    }
}

public class NumericOnly {
	
public static void main(String[] args) {
	

	 String  num;
     int sum=0;
     Scanner s=new Scanner(System.in);
     for(int i=0;i<10;i++){
         System.out.println("enter the number");
         num=s.next();
         if(num.matches("\\d+")){
             int num1=Integer.parseInt(num);
             sum+=num1;
         }
         else{
             try {
                 throw new IllegalArugumentException("enter valid number");
             } catch (Exception e) {

                 e.printStackTrace();
             }
         i--;                                
         }

     }
     System.out.println(sum);

 }

}