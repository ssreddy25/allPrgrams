package task;
import java.util.*;
public class PloyndriomeRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter min postive integer");
		int n=sc.nextInt();
		System.out.println("enter max postive integer");
		int m=sc.nextInt();
		int count=0;
		for(int i=n;i<=m;i++) {
			int rem,revrse=0,tem=i,tem1=i;
			while(tem>0){
				rem=tem%10;
				revrse=revrse*10+rem;
				tem=tem/10;
			}
			if(tem1==revrse) {
				//System.out.println(tem1);
				if(tem1%2!=0) {
					System.out.println(tem1+" is odd ployndrome");
					count++;
				}
			}
		}
		System.out.println(n+" in beetween range of ployndroime "+m+" "+count);
		
	}

}
