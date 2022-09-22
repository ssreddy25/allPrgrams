package task;
import java.util.*;
public class BigestOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter  postive integer");
		int n=sc.nextInt();
		System.out.println("enter  postive integer");
		int m=sc.nextInt();
		if(n>m) {
			System.out.println(n+" is grter than a "+m);
		}
		else {
			System.out.println(n+" is less than a "+m);
		}

	}

}
