package libraryManagement;

public class Book extends libraryItem{

    public Book(String id, String name) {
        this.item_id = id;
        this.item_name = name;
        this.availability = true; // Default to available
    }

    // Additional methods specific to Book can be added here
}
