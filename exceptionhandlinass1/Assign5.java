package exceptionhandlinass1;

import java.util.Scanner;

/**
 * 
 * @author ojas
 *
 *         5. Write a class Account with acc_no, name and balance. Initialize
 *         values throughparameterized constructor. If balance is between 1000
 *         and 5000, generateuser defined exception "Balance within the range".
 *         If name contains digits,raise exception "Name not Valid".
 *
 *
 */
class Blance extends RuntimeException {
	public Blance(String msg) {
		super(msg);

	}
}
class WrongName1  extends RuntimeException{
	public WrongName1(String msg){
		super(msg);
	}
}

public class Assign5 {
	public long accNo;
	public String name;
	public double balance;

	public Assign5(long accNo, String name, double balance) {

		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public void balance1(double bal) {
		if (bal >= 1000 && bal <= 5000) {
			throw new Blance("Balance within the range");
		}
		else {
			System.out.println("Balance with not  the range");
		}

	}
	public void aName(String name){
		boolean result = name.matches("[a-zA-Z]+");
		if (result == false) {
			throw new WrongName1("Name not Valid  :"+ name);
		} else {
			System.out.println("your name is valid  :"+ name);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the account details");
		System.out.println("enter the accno ");
		long accno = sc.nextLong();
		System.out.println("enter the name of the account holder");
		String name = sc.next();
		System.out.println("enter the balance is between 1000 and 5000");
		double bal = sc.nextDouble();
		Assign5 account = new Assign5(accno, name, bal);
		System.out.println("account holders deials ");
		System.out.println("accno  :"+account.accNo);
		account.aName(name);
		account.balance1(bal);
		

	}

}
