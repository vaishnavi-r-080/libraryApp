package libraryManagement;

import java.util.ArrayList;
import java.util.List;

public class Library implements LibraryServices
{
    private List<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        items.add(book);
        System.out.println(book.getItem_name() + " added to the library.");
    }

    @Override
    public void removeBook(Book book) {
        items.remove(book);
        System.out.println(book.getItem_name() + " removed from the library.");
    }

    @Override
    public void issueBook(Book book, User user) {
        if (book.isAvailability() && user.getBooksIssued() < 5) {
            book.setAvailability(false);
            user.addLibraryItem(book);
            user.setBooksIssued(user.getBooksIssued() + 1);
            System.out.println(user.getUserName() + " borrowed " + book.getItem_name());
        } else {
            System.out.println(book.getItem_name() + " is not available or " + user.getUserName() + " has reached the borrowing limit.");
        }
    }

    @Override
    public void returnBook(Book book, User user) {
        if (!book.isAvailability() && user.getLibraryItems().contains(book)) {
            book.setAvailability(true);
            user.getLibraryItems().remove(book);
            user.setBooksIssued(user.getBooksIssued() - 1);
            System.out.println(user.getUserName() + " returned " + book.getItem_name());
        } else {
            System.out.println(book.getItem_name() + " was not borrowed by " + user.getUserName());
        }
    }

    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println(item.getItem_name() + " added to the library.");
    }

    @Override
    public void removeItem(LibraryItem item) {
        items.remove(item);
        System.out.println(item.getItem_name() + " removed from the library.");
    }

    @Override
    public void borrowItem(LibraryItem item, User user) {
        if (item instanceof Periodical) {
            System.out.println("Periodicals cannot be borrowed.");
        } else if (item.isAvailability() && user.getBooksIssued() < 5) {
            item.setAvailability(false);
            user.addLibraryItem(item);
            user.setBooksIssued(user.getBooksIssued() + 1);
            System.out.println(user.getUserName() + " borrowed " + item.getItem_name());
        } else if(user.getBooksIssued() >= 5) {
            System.out.println(user.getUserName() + " has reached the borrowing limit.");
        }else {
            System.out.println(item.getItem_name() + " is not available.");
        }
    }

    @Override
    public void returnItem(LibraryItem item, User user) {
        if (!item.isAvailability() && user.getLibraryItems().contains(item)) {
            item.setAvailability(true);
            user.getLibraryItems().remove(item);
            user.setBooksIssued(user.getBooksIssued() - 1);
            System.out.println(user.getUserName() + " returned " + item.getItem_name());
        } else {
            System.out.println(item.getItem_name() + " was not borrowed by " + user.getUserName());
        }
    }
}
