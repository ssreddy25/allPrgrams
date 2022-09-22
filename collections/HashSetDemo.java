package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(25);
		hs.add(new Integer(69));
		hs.add("siva");
		hs.add("25");
		hs.add("siva");
		hs.add(100);
		System.out.println(hs);
		HashSet hs1 = new HashSet();
		hs1.add(988);
		hs1.add("reddy");
		hs1.add('r');
		hs1.add(100);
		System.out.println(hs1);
		HashSet hs2 = new HashSet();
		hs2.add(9881);
		hs2.add("reddy");
		hs2.add('k');
		hs2.add(100);
		System.out.println(hs2);
		hs.addAll(hs1);
		System.out.println(hs);
		hs1.clear();// clear is used for remove all the elemnts in hashset
		System.out.println(hs1);
		System.out.println(hs.contains("siva"));// contains() method cheking the
												// elements is their or not is
												// elemnt is thier return thr
												// true otherwise false
		System.out.println(hs.containsAll(hs1));// true the hs contain the hs1
		System.out.println(hs.containsAll(hs2));// false the hs not contain the
												// hs2
		System.out.println(hs.isEmpty());// false //the element is emptty is
											// return the true othewise false
		System.out.println(hs1.isEmpty());// true //the element is emptty is
											// return the true othewise false
		Iterator it = hs.iterator();// itereator is one of the cursor if only
									// forward direction
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		hs.remove('r');// remove is used for remove the paticular element.
		System.out.println(hs);
		hs.addAll(hs2);
		System.out.println(hs);
		System.out.println(hs.removeAll(hs2));// removeAll is used for remove
												// the paticulat inside
												// collecton object
		System.out.println(hs);
		System.out.println(hs.size());
		hs.addAll(hs2);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.retainAll(hs2));
		System.out.println(hs.size());
		System.out.println(hs);

	}

}
