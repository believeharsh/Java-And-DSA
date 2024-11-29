package OOPS.Library_Management_System;

import java.util.ArrayList;

public class LIbrary {
    private ArrayList<Book> books;

    public LIbrary() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println("Book already Exits in the Library");

        }
        books.add(book);
        System.out.println("Book added: " + book.getTitle());

    }

    public void issueBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (!book.isIssued()) {
                    book.issueBook();
                    System.out.println("Book issued: " + book.getTitle());
                    return;
                } else {
                    System.out.println("Book is already issued!");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    public void returnBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                if (book.isIssued()) {
                    book.returnBook();
                    System.out.println("Book returned: " + book.getTitle());
                    return;
                } else {
                    System.out.println("Book was not issued!");
                    return;
                }
            }
        }
        System.out.println("Book not found!");
    }

    public void displayBooks() {
        System.out.println("Library Books:");
        for (Book book : books) {
            System.out.println(book.getId() + ". " + book.getTitle() + " by " + book.getAuthor() +
                    (book.isIssued() ? " [Issued]" : " [Available]"));
        }
    }

}
