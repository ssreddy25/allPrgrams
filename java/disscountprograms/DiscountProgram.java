package disscountprograms;

public class DiscountProgram {

	public static void main(String[] args) {
		double price,discount,amount,s;
		price=5000;
		discount=25;
		System.out.println("marketprice is:"+price);
		System.out.println("discount is :"+discount);
		 s=100-discount;
		 amount=(s*price)/100;
		 System.out.println("amount after discount"+amount);

	}

}
