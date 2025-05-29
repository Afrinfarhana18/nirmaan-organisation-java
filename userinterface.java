package library2;

import java.util.ArrayList;
import java.util.Scanner;

	public class userinterface {
	    public static void main(String[] args) {
	        ArrayList<book> bookList = new ArrayList<book>();
	        Scanner sc = new Scanner(System.in);
	        bookservice service = new bookservice();

	        while (true) {
	            System.out.println(
	                "Enter your choice:\n1 - Add Book\n2 - Show All Books\n3 - Search Book by ID");
	            int key = sc.nextInt();

	            if (key == 1) {
	                bookList.add(service.addBook());

	            } else if (key == 2) {
	                service.getbooks(bookList);

	            } else if (key == 3) {
	                System.out.println("Enter the Book ID:");
	                int id = sc.nextInt();
	                book found = service.getbookById(id, bookList);
	                if (found != null) {
	                    System.out.println(found);
	                } else {
	                    System.out.println("Book not found with ID: " + id);
	                }
	            } else {
	                System.out.println("Invalid choice. Try again.");
	            }
	        }
	    }
	}


