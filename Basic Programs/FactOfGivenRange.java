package task;
import java.util.*;

public class FactOfGivenRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a postive integer");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			
			int fact=1;
			for(int j=1;j<=i;j++) {
				fact*=j;
			}
			System.out.print(fact+",");
		}
		

	}

}
