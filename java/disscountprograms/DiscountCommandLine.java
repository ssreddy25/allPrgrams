package disscountprograms;

public class DiscountCommandLine {

	public static void main(String[] args) {
		double amount,s;
		double price=Double.parseDouble(args[0]);
	   double discount=Double.parseDouble(args[1]);
		System.out.println("marketprice is:"+price);
		System.out.println("discount is :"+discount);
		 s=100-discount;
		 amount=(s*price)/100;
		 System.out.println("amount after discount"+amount);

	}

}
