package patternprograms;
/**
 * 
 * @author su22034
 *    1 3 5 7 9  
 *    11 13 15 17 19  
 *   21 23 25 27 29  
 *   31 33 35 37 39  
 *   41 43 45 47 49 
 */
public class Patern6 {

	public static void main(String[] args) {
		int star = 10, number = 0;
		for (int i = 1; i <= 5; ++i) {

			for (int j = 1; j <= star; ++j) {
				++number;
				 if(number%2==1)
				System.out.print(number + " ");
			}

			System.out.println(" ");
		}
	}

}
