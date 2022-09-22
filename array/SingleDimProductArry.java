package array;

import java.util.Arrays;
import java.util.Scanner;

class Product implements Comparable<Product> {
	int id;
	String name;
	double price;
	String quanty;
	public Product(int id, String name, double price, String quanty) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.quanty = quanty;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", quanty=" + quanty + "]";
	}
	public int compareTo(Product p) {
		// TODO Auto-generated method stub
		return name.compareTo(p.name);
	}
	
	
}
public class SingleDimProductArry {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the products size");
		int size=sc.nextInt();
		Product[] product=new Product[size];
		for(int i=0;i<size;++i){
			System.out.println("enter the product id");
			int id=sc.nextInt();
			System.out.println("enter the product name");
			String name=sc.next();
			System.out.println("enter the product price");
			double price=sc.nextDouble();
			System.out.println("enter the quanty ");
			String quanty=sc.next();
			product[i]= new Product(id,name,price,quanty);
		}
		Arrays.sort(product);
		for(Product pro:product){
			System.out.println(pro);
		}
		
	}

}
