package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/**
 * 
 * @author ojas
 *LinkedHashSet:
 *1.linkedhasset is not allowed duplicates 
 *2.linkedhaset is  allowed insertion preserived.
 *3.linkedhast is curoser is used to iterator
 */
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet ls = new LinkedHashSet();
		ls.add(25);
		ls.add(new Integer(689));
		ls.add("siva");
		ls.add(25);
		ls.add("siva");
		ls.add(100);
		System.out.println(ls);
		LinkedHashSet ls1 = new LinkedHashSet();
		ls1.add("reddy");
		ls1.add('r');
		ls1.add(100);
		ls1.add(150);
		System.out.println(ls1);
		Iterator it=ls1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		HashSet hs1 = new HashSet();
		hs1.add(988);
		hs1.add("reddy");
		hs1.add('r');
		hs1.add(100);
		ls.addAll(hs1);
		System.out.println(ls);
	
	
		

	}

}
