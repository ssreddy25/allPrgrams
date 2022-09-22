package patternprograms;
/**
 * 
 * @author su22034
 *   2 1 2 1 2 
     3 2 3 2 3 
     4 3 4 3 4 
     5 4 5 4 5 
     6 5 6 5 6 
 */
public class Patern9 {

	public static void main(String[] args) {
		for(int i=1;i<=5;++i) {
			for(int j=1;j<=5;++j) {
				System.out.print(i+j%2+" ");
			}
			System.out.println();
		}

	}

}
