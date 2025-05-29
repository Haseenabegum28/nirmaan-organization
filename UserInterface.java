package lbm;


import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		ArrayList<Book> al = new ArrayList<Book>();
		Scanner sc = new Scanner(System.in);
		bookservice service = new bookservice();
		Book emp = new Book();
		while (true) {
			System.out.println(
					"Enter your choice \n 1 for add a book  \n 2 for show the book \n 3 for search book By Id");
			int key = sc.nextInt();

			if (key == 1) {
				al.add(service.addbook());

			} else if (key == 2) {
				service.getBooks(al);
			} else if (key == 3) {
				System.out.println("Enter the Book Id : ");
				int id = sc.nextInt();
				System.out.println(service.getBookById(id,al));
			}

		}
	}

}
