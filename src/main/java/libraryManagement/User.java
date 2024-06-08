package libraryManagement;

import java.util.ArrayList;

public class User {

    private String UserId;
    private String UserName;
    private int Books_Issued;//No. of items issued ; to ensures not more than 5 items are issued
    private ArrayList<libraryItem> LibraryItems ;// to store library items issued by the user

    public User(String userId, String userName) {
        this.UserId = userId;
        this.UserName = userName;
        this.Books_Issued = 0;
        this.LibraryItems = new ArrayList<>();
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public int getBooks_Issued() {
        return Books_Issued;
    }

    public void setBooks_Issued(int books_Issued) {
        Books_Issued = books_Issued;
    }

    public void addLibraryItem(libraryItem item) {
        this.LibraryItems.add(item);
    }

    public ArrayList<libraryItem> getLibraryItems() {
        return new ArrayList<>(this.LibraryItems); // Return a copy to protect the internal list
    }
}
