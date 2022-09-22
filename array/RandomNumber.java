package array;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number the dice");
		int random=sc.nextInt();
		Random ran=new Random();
		int total=0;
		for(int i=0;i<random;++i){
			int num=ran.nextInt(6)+1;
			System.out.print(num+" ");
			total+=num;
		}
		System.out.println();
		System.out.println("total"+"="+ total);

	}

}
