package oops;

public class Account {
	public String id;
	public String name;
	public int blance;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int blance) {

		this.id = id;
		this.name = name;
		this.blance = blance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBlance() {
		return blance;
	}
	public int  debitAmount(int amount){
		if(amount<=blance){
			System.out.println(this.blance-amount);
		}else{
			System.out.println("amount in sufficent in your account");
		}
		return this.blance;
		
	}
	public int creditAmount(int amount){
		this.blance=this.blance+amount;
		return this.blance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", blance=" + blance + "]";
	}
	
}
