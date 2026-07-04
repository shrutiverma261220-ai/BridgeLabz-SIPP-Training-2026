public abstract class WarehouseItem {

    private int itemId;
    private String itemName;
    private double price;

    public WarehouseItem(int itemId, String itemName, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.price = price;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Abstract method (implemented by child classes)
    public abstract void displayDetails();

    @Override
    public String toString() {
        return "Item ID : " + itemId +
               ", Item Name : " + itemName +
               ", Price : ₹" + price;
    }
}