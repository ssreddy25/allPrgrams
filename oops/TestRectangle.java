package oops;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rectangele length");
		float length=sc.nextFloat();
		System.out.println("enter the rectangle width");
		float width=sc.nextFloat();
		Rectangle rectangle=new Rectangle(length,width);
		System.out.println(rectangle.getLenght());
		System.out.println(rectangle.getWidth());
		
       System.out.println(rectangle.getAera());
       System.out.println(rectangle.getPerimeter());
       
       rectangle.setLenght(45.4f);
       rectangle.setWidth(35.9f);
       System.out.println("***************************");
       System.out.println(rectangle.getLenght());
		System.out.println(rectangle.getWidth());
		 System.out.println("***************************");
       System.out.println(rectangle.getAera());
       System.out.println(rectangle.getPerimeter());
	}

}
