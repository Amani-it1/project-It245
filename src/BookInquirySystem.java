import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BookInquirySystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book("Java Programming", "James Gosling", 2020));
		books.add(new Book("Data Structures", "Mark Allen", 2019));
		books.add(new Book("Database System", "Thomas Connolly", 2021));
		books.add(new Book("Computer Networks", "Andrew Tanenbaum", 2018));

		int choice;

		do {

		    System.out.println("\n===== Book Inquiry System =====");
		    System.out.println("1. Display Books");
		    System.out.println("2. Add Book");
		    System.out.println("3. Search Book");
		    System.out.println("4. Delete Book");
		    System.out.println("5. Exit");

		    System.out.print("Enter your choice: ");
		    choice = input.nextInt();
		    input.nextLine();
            
			switch (choice) {

		        case 1:
		            displayBooks(books);
		            break;

		        case 2:
		            addBook(books);
		            break;

		        case 3:
		            searchBook(books);
		            break;

		        case 4:
		            deleteBook(books);
		            break;

		        case 5:
		            System.out.println("Thank you for using the system.");
		            break;

		        default:
		            System.out.println("Invalid choice.");

		    }

		} while (choice != 5);

	}

	public static void addBook(ArrayList<Book> books) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter book title: ");
		String title = input.nextLine();

		System.out.print("Enter author: ");
		String author = input.nextLine();

		System.out.print("Enter year: ");
		int year = input.nextInt();

		books.add(new Book(title, author, year));

		System.out.println("Book added successfully.");

	}

	public static void searchBook(ArrayList<Book> books) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter book title to search: ");
		String searchTitle = input.nextLine();

		boolean found = false;

		for (Book book : books) {
		    if (book.title.equalsIgnoreCase(searchTitle)) {
		        System.out.println(book);
		        found = true;
		    }
		}

		if (!found) {
		    System.out.println("Book not found.");
		}

	}

	public static void deleteBook(ArrayList<Book> books) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter book title to delete: ");
		String deleteTitle = input.nextLine();

		boolean found = false;

		for (int i = 0; i < books.size(); i++) {
		    if (books.get(i).title.equalsIgnoreCase(deleteTitle)) {
		        books.remove(i);
		        System.out.println("Book deleted successfully.");
		        found = true;
		        break;
		    }
		}

		if (!found) {
		    System.out.println("Book not found.");
		}

	}

	public static void displayBooks(ArrayList<Book> books) {
		System.out.println("Book List:");
		System.out.println("--------------------");

		for (Book book : books) {
			System.out.println(book);
		}

	}
}
