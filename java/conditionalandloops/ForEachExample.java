package conditionalandloops;

public class ForEachExample {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 50, 60 };
		System.out.println("for loop noraml flow");
		for (int i = 0; i < a.length; ++i) {
			System.out.println(a[i]);
		}
		System.out.println("foreach noraml flow");
		for (int j : a) {
			System.out.println(j);
		}

	}

}
