import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem> {

    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    // Add an item
    public void addItem(T item) {
        items.add(item);
        System.out.println(item.getItemName() + " added successfully.");
    }

    // Remove an item
    public void removeItem(T item) {
        if (items.remove(item)) {
            System.out.println(item.getItemName() + " removed successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Return all items
    public List<T> getAllItems() {
        return items;
    }

    // Display all items
    public void displayItems() {

        if (items.isEmpty()) {
            System.out.println("Storage is empty.");
            return;
        }

        System.out.println("\n===== Storage Items =====");

        for (T item : items) {
            item.displayDetails();
        }
    }

    // Find item by ID
    public T findItemById(int id) {

        for (T item : items) {

            if (item.getItemId() == id) {
                return item;
            }
        }

        return null;
    }

    // Total number of items
    public int getTotalItems() {
        return items.size();
    }
}