package task;
import java.util.*;
public class BigestFive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a postive integer");
		int a=sc.nextInt();
		
		for(int i=1;i<=4;i++) {
			System.out.println("enter b postive integer");
			int b=sc.nextInt();
			if(a>b) {
				System.out.println(a+" is big ");
			}
			else {
				System.out.println(b+" is big ");
			}
		}
		
		
		
		
		
		

	}

}
