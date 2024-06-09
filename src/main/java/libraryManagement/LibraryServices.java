package libraryManagement;

public interface LibraryServices {

    void addBook(Book book);
    void removeBook(Book book);
    void issueBook(Book book, User user);
    void returnBook(Book book, User user);

    void addItem(LibraryItem item);
    void removeItem(LibraryItem item);
    void borrowItem(LibraryItem item, User user);
    void returnItem(LibraryItem item, User user);
}
