package composition;
class Author{
	String name;
	String email;
	 char gender;
	public Author(String name, String email, char gender) {
		
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}
	
	 
}
class Book1{
	String name;
	int price;
	Author author;
	int qty;
	public Book1(String name, int price, Author author, int qty) {
		
		this.name = name;
		this.price = price;
		this.author = author;
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Book1 [name=" + name + ", price=" + price + ", author=" + author + ", qty=" + qty + "]";
	}
	
	
}

public class Book {

	public static void main(String[] args) {
		Book1 b1=new Book1("siva",45,new Author("rangith","ssreddy251098@gmail.com",'m'),25);
	System.out.println(b1);

	}

}
