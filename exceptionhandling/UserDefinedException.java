package exceptionhandling;

import java.util.Scanner;

class NameNotAvilable extends RuntimeException {
	NameNotAvilable(String na) {
		super(na);
	}

}

public class UserDefinedException {

	public static void main(String[] args) throws NameNotAvilable {
		Scanner sc = new Scanner(System.in);
		String[] names = { "siva", "ranjith", "mannu", "chandhu", "gopi" };
		System.out.println("enter the your name ");
		String na = sc.next();
		boolean name1 = false;

		for (int i = 0; i < names.length; ++i) {

			if (names[i].equalsIgnoreCase(na)) {
				name1 = true;
				System.out.println("your name avilable in the empliyee LIST  " + names[i]);
			}
		}
		if (name1 == false) {
			throw new NameNotAvilable("your the name is not in the employees list " + na);
		}
	}

}
