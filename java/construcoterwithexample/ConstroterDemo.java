package construcoterwithexample;

public class ConstroterDemo {
	public String fName;
	public String lastName;
	public int age;
	public String boodGroup;
	

	public ConstroterDemo(String fName, String lastName, int age, String boodGroup) {
		super();
		this.fName = fName;
		this.lastName = lastName;
		this.age = age;
		this.boodGroup = boodGroup;
	}


	public static void main(String[] args) {
		
		ConstroterDemo constroterDemo=new ConstroterDemo("siv sankar reddy","uppaluru",23,"B+ve");
		System.out.println("          Details");
		System.out.println("frist name  : "+constroterDemo.fName);
		System.out.println("last name   : "+constroterDemo.lastName);
		System.out.println("age         : "+constroterDemo.age);
		System.out.println("blood group : "+constroterDemo.boodGroup);

	}

}
