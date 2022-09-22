package patternprograms;

/**
 * 
 * @author su22034 
 * 1 2 3 4 5 
 * 6 7 8 9 10 
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 */

public class Patern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star = 5, number = 0;
		for (int i = 1; i <= 5; ++i) {

			for (int j = 1; j <= star; ++j) {
				++number;
				
				System.out.print(number + " ");
			}

			System.out.println(" ");
		}

	}

}
