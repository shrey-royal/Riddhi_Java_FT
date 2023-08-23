/*
Scenario 11: Library Management System
Design a library management system where you have classes like "Library," "Book," and "Member." Implement methods for borrowing, returning, and searching for books.
*/

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
}

class Member {
    private String name;
    private Book[] borrowedBooks;
    private int numBorrowedBooks;

    public Member(String name, int maxBooks) {
        this.name = name;
        this.borrowedBooks = new Book[maxBooks];
        this.numBorrowedBooks = 0;
    }

    public String getName() {
        return name;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if(numBorrowedBooks < borrowedBooks.length && book.isAvailable()) {
            borrowedBooks[numBorrowedBooks] = book;
            book.setAvailability(false);
            numBorrowedBooks++;
            System.out.println("Book '" + book.getTitle() + "' borrowed by " + name);
        } else {
            System.out.println("Book '" + book.getTitle() + "' is not available for borrowing.");
        }
    }

    public void returnBook(Book book) {
        int index = -1;
        for (int i = 0; i < numBorrowedBooks; i++) {
            if(borrowedBooks[i] == book) {
                index = i;
                break;
            }
        }

        if(index != -1) {
            for(int i = index; i < numBorrowedBooks-1; i++) {
                borrowedBooks[i] = borrowedBooks[i+1];  // Shift all books to the left
            }
            borrowedBooks[numBorrowedBooks-1] = null;
            book.setAvailability(true);
            numBorrowedBooks--;
            System.out.println("Book '" + book.getTitle() + "' returned by " + name);
        } else {
            System.out.println("You didn't borrow this book.");
        }
    }
}

class Library


public class Task11 {
    public static void main(String[] args) {
        //
    }
}