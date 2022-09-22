package array;

import java.util.Scanner;

public class SortingArraySingle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the arry size");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("enter the element of the arry");
		for(int i=0;i<size;++i){
			array[i]=sc.nextInt();
		}
		int tem;
		for(int i=0;i<size-1;++i){
			for(int j=0;j<size-1-i;++j){
				if(array[j]>array[j+1]){
					tem=array[j];
					array[j]=array[j+1];
					array[j+1]=tem;
				}
				
			}
		}
		System.out.println("the element of the  sort array");
		for(int arry:array){
			System.out.println(arry);
		}
		

	}

}
