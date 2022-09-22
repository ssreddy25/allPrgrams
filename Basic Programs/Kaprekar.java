package task;
import java.util.*;
public class Kaprekar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a postive intger");
		int n=sc.nextInt();
		int tem=n;
		int squar=n*n;
		int rem,add=0;
		while(squar>0) {
		rem=squar%10;
        add=add+rem;
        squar=squar/10;
		}
		if(add==tem) {
			System.out.println(tem+" is kaprekar number");
		}
		else {
			System.out.println(tem+" is not  kaprekar number");
		}
	}

}
