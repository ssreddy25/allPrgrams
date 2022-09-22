package task;
import java.util.*;
public class RusainMultification {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min postive integer");
		int n=sc.nextInt();
		System.out.println("enter max postive integer");
		int m=sc.nextInt();
		int z=0;
			while(m!=0) {
			if(m%2==1) {
			z=z+n;
			n=n*2;
			m=m/2;
			}

			if(m%2==0) {
			
			n=n*2;
			m=m/2;

			}
			}
			System.out.println(z);
	}	

}


