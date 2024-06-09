package libraryManagement;

public class DVD extends LibraryItem {

    public DVD(String id, String name) {
        this.item_id = id;
        this.item_name = name;
        this.availability = true;
    }
}
