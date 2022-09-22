package array;

import java.util.Scanner;

public class SortArryString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=sc.nextInt();
		String[] string=new String[size];//create the String array Object
		System.out.println("enter the String names");
		//passing the array valueas in to the Object
		for(int i=0;i<size;++i){
			string[i]=sc.next();
		}//logic of the compare to the String
		String tem;
		for(int i=0;i<size-1;++i){
			for(int j=0;j<size-1-i;++j){
				if(string[j].compareTo(string[j+1])>0){
					tem=string[j];
					string[j]=string[j+1];
					string[j+1]=tem;
				}
			}
		}//print the sort of the String
		System.out.println("after the sort the string");
		for(String name:string){
			System.out.println(name);
		}
		
		
	}

}
