package assign4;

public class Account {
	public long accNo;
	public String Name;
	public long mobileNumber;
	private double balance;

	public void deposit(double amount) {
		balance += amount;

	}

	public double Withdraw(double amount) {
		balance = 0;
		if (amount <= balance) {
			return balance = balance - amount;
		} else {
			System.out.println("insuficent balance");
		}
		return balance;

	}

	public double getBalance() {
		return balance;
	}

}
