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
