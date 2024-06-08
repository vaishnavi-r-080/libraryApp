package libraryManagement;

public interface LibraryServices {

    void addBook(Book book);
    void removeBook(Book book);
    void issueBook(Book book , User user);
    void returnBook(Book book , User user);

}
