package exceptionhandlinass1;

import java.util.Scanner;

/**
 * 
 * @author ojas 1. Write Java Program to accept a number from user, if number is
 *         zero throwuser defined exception "Number is 0" otherwise check
 *         whether no. is prime ornot(use static keyword).
 */
 class DoNotInterZero extends RuntimeException{
	 DoNotInterZero(String msg){
		 super(msg);
	 }
 }
public class Assin1 {
	 static int num;
	 
	 public static void prime(int num){
		 int count=0;
		 for(int i=1;i<=num;i++){
			 if(num%i==0){
				 count++;
				 
			 }
		 }
		 if(count==2){
			 System.out.println(num+ " is prime number");
		 }
		 else{
			 System.out.println(num+ " is not prime number");
		 }
	 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num==0){
			throw new DoNotInterZero("Number is 0");
			
		}
		else{
			prime(num);
		}
		
		
		

	}

}
