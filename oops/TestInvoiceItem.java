package oops;

import java.util.Scanner;

public class TestInvoiceItem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the item id");
		String id=sc.next();
		System.out.println("enter the description of the item");
		String desc=sc.next();
		System.out.println("enter the quanty of the item");
		int quty=sc.nextInt();
		System.out.println("enter the unit perice of the item");
		double unitprice=sc.nextDouble();
		System.out.println("****************************");
		
		InvoiceItem invoiceItem=new InvoiceItem (id, desc, quty, unitprice);
		System.out.println(invoiceItem);
		System.out.println("total itemprice :"+invoiceItem.getTotal());
		
		System.out.println("****************************");
		
		
	}

}
