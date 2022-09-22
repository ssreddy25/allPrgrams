package task;
import java.util.*;
public class BgestOfThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a postive integer");
		int a=sc.nextInt();
		System.out.println("enter b postive integer");
		int b=sc.nextInt();
		System.out.println("enter c  postive integer");
		int c=sc.nextInt();
		if(a>b&&a>c) {
			System.out.println(a+" is big ");
		}
		else if(b>c) {
			System.out.println(b+" is big ");
		}
		else {
			System.out.println(c+" is big ");
		}
	}

}
