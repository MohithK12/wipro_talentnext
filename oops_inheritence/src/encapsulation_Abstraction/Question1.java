package encapsulation_Abstraction;

public class Question1 {

	public static void main(String[] args) {
		Author author= new Author("rahul","ral@gmail.com",'M');
		Book book = new Book("Harrypotter",author,499.99,100);
		System.out.println("Book Name : "+book.getName());
		System.out.println("Price : ₹"+book.getPrice());
		System.out.println("Quantity in stock : "+book.getQtyInstock());
		System.out.println("Author Info : "+book.getAuthor());
	}
}
class Author{
	private String name,email;
	private char gender;
	Author(String name,String email,char gender){
		this.name= name;
		this.email=email;
	    this.gender=gender;
	}
 	String getName() {
 		return name;
 	}
 	String getEmail() {
 		return email;
 	}
 	char getGender() {
 		return gender;
 	}
 	public String toString() {
 		return name+" ("+gender+") "+email;
 	}
	
}
class Book{
	private String name;
	private Author author;
	private double price;
	private int qtyInstock;
	Book(String name,Author author,double price,int qtyInstock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInstock=qtyInstock;
	}
	public String getName(){
		return name;
	}
	public Author getAuthor(){
		return author;
	}
	public double getPrice() {
		return price;
	}
	public int getQtyInstock() {
		return qtyInstock;
	}
}
