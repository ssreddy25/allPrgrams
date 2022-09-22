package aeraofcricle;

import java.util.Scanner;

/**
 * 
 * @author su22034
 *wap using interfaces area of cricle
 */
interface AreaOfCricle{
	void cricle();
}
public class AeraOfCricleUsingInterface implements AreaOfCricle {

	double area;
	public void cricle(double r)
	{
		area=(22*r*r)/7;
	}
	public static void main(String[] args) {
		AeraOfCricleUsingInterface x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius");
		double rad=sc.nextDouble();
		x=new AeraOfCricleUsingInterface();
		x.cricle(rad);
		System.out.println("area of cricle is "+x.area);
	}
}


