package oops;

import java.util.Scanner;

public class TestAmount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the account id");
		String id=sc.next();
		System.out.println("enter the name");
		String name=sc.next();
		System.out.println("enter the balance");
		int blance=sc.nextInt();
		
	    System.out.println("*******ACOUNT DETALIS*******");
		Account account=new Account(id, name, blance);
		System.out.println("account id:"+account.getId());
		System.out.println("accont name:"+account.getName());
		System.out.println("account blance:"+account.getBlance());
		System.out.println("enter the debit amount");
		
		int amount=sc.nextInt();
		
		 System.out.println(account.debitAmount(amount));
		 System.out.println(account);
		
	}

}
