package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(56);
		al.add(25);
		al.add("java");
		al.add("oops");
		al.add('c');
		al.add(26.0);
		al.add(56);
		al.add(2, 10);
		al.add(null);
		System.out.println(al.get(6));//get method provided the position of the index element
		System.out.println(al);
		ListIterator li=al.listIterator();
				System.out.println("forword direction");
				while(li.hasNext()){
					System.out.println(li.next());
				}
				System.out.println("backword direction");
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
		
		
		

	}

}
