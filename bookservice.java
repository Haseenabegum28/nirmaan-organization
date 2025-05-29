package lbm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class bookservice {
	Scanner sc = new Scanner(System.in);

	// add Book
	public Book addbook() {

		System.out.println("Enter the Book ID ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Book Name ");
		String name = sc.nextLine();
		System.out.println("Enter the Author Name ");
		String authorname = sc.nextLine();
		System.out.println("Enter the price");
		double price = sc.nextDouble();

		return new Book(id, name, authorname, price);
}
	// read Book
		public void getBooks(ArrayList<Book> Books) {
			System.out.println(Books);

		}

		// read Book By ID
		public Book getBookById(int id, ArrayList<Book> Books) {

			for (Book bo : Books) {
				if (bo.getId() == id) {
					return bo;
				}
			}

			return null;

		}

}
