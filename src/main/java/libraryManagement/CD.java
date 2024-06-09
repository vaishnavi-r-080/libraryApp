package libraryManagement;

public class CD extends LibraryItem {

    public CD(String id, String name) {
        this.item_id = id;
        this.item_name = name;
        this.availability = true;
    }
}
