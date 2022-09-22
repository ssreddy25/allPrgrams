package collectionassignment;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author ojas 1).Write a program to the input an ArrayList and then accepts
 *         user input that is then cross-checked with said list?
 *
 *
 */
public class Assin1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(25);
		al.add("siva");
		al.add(98);
		al.add("ojas");
		if (al.contains("siva")) {
			System.out.println("avilable in the ArrayList");
		} else {
			System.out.println(" Not avilable in the ArrayList");
		}

	}

}
