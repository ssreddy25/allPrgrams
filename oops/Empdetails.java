package oops;

import java.util.Scanner;

public class Empdetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enteer the product size");
		int size = sc.nextInt();
		Employee[] employee = new Employee[size];
		for (int i = 0; i < size; ++i) {
			System.out.println("enter the emp id");
			int id = sc.nextInt();
			System.out.println("enter the fristName");
			String fname = sc.next();
			System.out.println("enter the lastname");
			String lname = sc.next();
			System.out.println("enter the salary");
			int sal = sc.nextInt();
			System.out.println();
			employee[i] = new Employee(id, fname, lname, sal);
		}
		for(int i=0;i<size;++i){
			System.out.println(employee[i]);
		}

	}

}
