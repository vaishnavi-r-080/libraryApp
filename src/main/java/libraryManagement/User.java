package libraryManagement;

import java.util.ArrayList;

public class User {

    private String userId;
    private String userName;
    private int booksIssued; // No. of items issued; to ensure not more than 5 items are issued
    private ArrayList<LibraryItem> libraryItems; // to store library items issued by the user

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.booksIssued = 0;
        this.libraryItems = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBooksIssued() {
        return booksIssued;
    }

    public void setBooksIssued(int booksIssued) {
        this.booksIssued = booksIssued;
    }

    public void addLibraryItem(LibraryItem item) {
        this.libraryItems.add(item);
    }

    public ArrayList<LibraryItem> getLibraryItems() {
        return new ArrayList<>(this.libraryItems); // Return a copy to protect the internal list
    }
}
