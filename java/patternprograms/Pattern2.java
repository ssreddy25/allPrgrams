package patternprograms;
/**
 * 
 * @author su22034
 * wap
 *  1 1 1 1 1
 *  2 2 2 2 2
 *  3 3 3 3 3
 *  4 4 4 4 4
 *  5 5 5 5 5
 */
public class Pattern2 {

	public static void main(String[] args) {
		int star=5,number=0;
		for(int i=1;i<=5;++i) {
			number++;
			for(int j=1;j<=star;++j) {
				System.out.print(number+" ");
			}
			System.out.println("");
		}

	}

}
