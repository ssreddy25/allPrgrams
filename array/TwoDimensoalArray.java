package array;

import java.util.Scanner;

public class TwoDimensoalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the row size");
		int row=sc.nextInt();
		System.out.println("enter the colmn size");
		int colmn=sc.nextInt();
		int[][] twoArray=new int[row][colmn];
		System.out.println("enter the array elemnts");
		for(int i=0;i<row;++i){
			for(int j=0;j<colmn;++j){
				twoArray[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("print the two dimensional arry");
		for(int i=0;i<row;++i){
			System.out.print("[");
			for(int j=0;j<colmn;++j){
				System.out.print(twoArray[i][j]+" ");
			}
			System.out.print("]");
			System.out.println();
			
		}

	}

}
