package patternprograms;

/**
 * 
 * @author su22034 wap 
 * 5 4 3 2 1 
 * 5 4 3 2 1
 * 5 4 3 2 1 
 * 5 4 3 2 1 
 * 5 4 3 2 1
 * 
 */
public class Patern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int star = 5;
		for (int i = 1; i <= 5; ++i) {
			int number = 5;
			for (int j = 1; j <= star; ++j) {

				System.out.print(number-- + " ");

			}
			System.out.println(" ");
		}

	}

}
