package LibraryManagementSystem;


import java.util.Arrays;

public class LibraryManagementSystem {
    private Book[] books;

    public LibraryManagementSystem(Book[] books) {
        this.books = books;
    }

  
    public Book linearSearchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; 
    }

  
    public Book binarySearchByTitle(String title) {
        int left = 0;
        int right = books.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books[mid];
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null; 
    }

    public static void main(String[] args) {
       
        Book[] books = {
            new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"),
            new Book("B002", "To Kill a Mockingbird", "Harper Lee"),
            new Book("B003", "1984", "George Orwell"),
            new Book("B004", "The Catcher in the Rye", "J.D. Salinger"),
            new Book("B005", "The Hobbit", "J.R.R. Tolkien")
        };

       
        Arrays.sort(books, (b1, b2) -> b1.getTitle().compareToIgnoreCase(b2.getTitle()));

        LibraryManagementSystem library = new LibraryManagementSystem(books);

      
        System.out.println("Linear Search:");
        Book book = library.linearSearchByTitle("1984");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }

      
        System.out.println("\nBinary Search:");
        book = library.binarySearchByTitle("The Hobbit");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }
}
