package libraryManagement;

public class Periodical extends LibraryItem {

    public Periodical(String id, String name) {
        this.item_id = id;
        this.item_name = name;
        this.availability = true; // Default to available
    }
}
