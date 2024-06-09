package libraryManagement;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User user1 = new User("1", "Paras");

        Book book1 = new Book("B001", "Full Stack Java");
        CD cd1 = new CD("C001", "Death Note");
        DVD dvd1 = new DVD("D001", "Attack on Titan");
        Periodical periodical1 = new Periodical("P001", "Naruto");

        library.addBook(book1);
        library.addItem(cd1);
        library.addItem(dvd1);
        library.addItem(periodical1);

        library.issueBook(book1, user1); // Paras borrows Effective Java
        library.issueBook(book1, user1); // Paras borrows Effective Java
        library.borrowItem(periodical1, user1); // Paras tries to borrow Nature

        library.returnBook(book1, user1); // Paras returns Effective Java

        library.removeItem(cd1); // Remove CD from the library
    }
}
