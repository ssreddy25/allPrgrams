package patternprograms;
/**
 * 
 * @author su22034
 *  2 4 6 8 10  
   12 14 16 18 20  
   24 26 28 30  
   32 34 36 38 40  
   42 44 46 48 50  
 */
public class Patern7 {

	public static void main(String[] args) {
		int star = 10, number = 0;
		for (int i = 1; i <= 5; ++i) {

			for (int j = 1; j <= star; ++j) {
				++number;
				 if(number%2==0)
				System.out.print(number + " ");
			}

			System.out.println(" ");
		}
	}

}
