package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer,String> hm=new HashMap<>();
		hm.put(100,"siva");
		hm.put(108,"siva");
		hm.put(201,"raja");
		hm.put(102,"rani");
		hm.put(103,"king");
		hm.put(104,"quen");
		hm.put(105,"solider");
		hm.put(115,"solider");
		hm.put(null,"reddy");
		hm.put(106,null);
		hm.put(109,null);
		hm.put(116,null);
		hm.put(117,null);
		hm.put(null,"siva sankar reddy");
		Map<Integer,String> hm1=new HashMap<>();
		hm1.put(200,"siva");
		hm1.put(208,"siva");
		hm1.put(202,"raja");
		hm1.put(204,"rani");
		hm1.put(203,"king");
		hm1.put(205,"quen");
		hm.putAll(hm1);
	
		System.out.println(hm);
		//print paticular key vlues go to the get()
		System.out.println(hm.get(105));
		
	       Set<Integer>	key=hm.keySet();// keyset() print only printed the key vlaues in a 
	       System.out.println(key);
	       Collection c=hm.values();//valuse() print only print vlaues only return type is Collection
	       System.out.println(c);
	      Set<Entry<Integer,String>> e= hm.entrySet();//entrySet() is print the both key and  vlaues
	      System.out.println("keys"+"\t"+"vlues");
	      for(Entry ss:e ){
	    	  System.out.println(ss);
	      }
	      System.out.println("hasmap size ");
	      System.out.println(hm.size());
	     
		
		

	}

}
