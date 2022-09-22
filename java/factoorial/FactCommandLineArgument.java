package factoorial;

public class FactCommandLineArgument {

	public static void main(String[] args) {
		long fact=1;
		long number=Long.parseLong(args[0]);
		for(int i=1;i<=number;++i) {
			fact*=i;
		}
		System.out.println(number+" factroial is a: "+fact);

	}

}
