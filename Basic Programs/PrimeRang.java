package task;
import java.util.Scanner;

public class PrimeRang {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min postive integer");
		int n=sc.nextInt();
		System.out.println("enter max postive integer");
		int m=sc.nextInt();
		for(int i=n;i<=m;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}

	}

}
