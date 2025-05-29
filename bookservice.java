package library2;

import java.util.ArrayList;
import java.util.Scanner;

public class bookservice {
    Scanner sc = new Scanner(System.in);

    // Add Book
    public book addBook() {
        System.out.println("Enter the Book ID:");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.println("Enter the Book Title:");
        String title = sc.nextLine();

        System.out.println("Enter the Book Author:");
        String author = sc.nextLine();

        System.out.println("Enter the Book Price:");
        double price = sc.nextDouble();

        return new book(id, title, author, price);
    }

    // Read all Books
    public void getbooks(ArrayList<book> books) {
        for (book book : books) {
            System.out.println(book);
        }
    }

    // Read Book by ID
    public book getbookById(int id, ArrayList<book> books) {
        for (book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }
}
