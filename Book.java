package lbm;

public class Book {
	int id;
	String bookname;
	String Authorname;
	double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Book(int id, String bookname, String authorname, double price) {
		super();
		this.id = id;
		this.bookname = bookname;
		Authorname = authorname;
		this.price = price;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookname=" + bookname + ", Authorname=" + Authorname + ", price=" + price + "]";
	}
	
}
