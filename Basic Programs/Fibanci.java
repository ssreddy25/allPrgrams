package task;
import java.util.*;
public class Fibanci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a postive integer");
		int n=sc.nextInt();
		int num=0,num1=1,sum;
		System.out.print(num+" "+num1);
		for(int i=2;i<n;i++) {
            sum=num+num1;
            System.out.print(" "+sum);
            num=num1;
            num1=sum;
		}
	}

}
