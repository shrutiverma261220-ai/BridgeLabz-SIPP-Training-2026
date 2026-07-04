public class Groceries extends WarehouseItem {

    private String expiryDate;
    private double weight;

    public Groceries(int itemId, String itemName, double price,
                     String expiryDate, double weight) {
        super(itemId, itemName, price);
        this.expiryDate = expiryDate;
        this.weight = weight;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public double getWeight() {
        return weight;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void displayDetails() {
        System.out.println("===== Grocery Item =====");
        System.out.println("Item ID      : " + getItemId());
        System.out.println("Item Name    : " + getItemName());
        System.out.println("Price        : ₹" + getPrice());
        System.out.println("Expiry Date  : " + expiryDate);
        System.out.println("Weight       : " + weight + " kg");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Groceries{" +
                "itemId=" + getItemId() +
                ", itemName='" + getItemName() + '\'' +
                ", price=" + getPrice() +
                ", expiryDate='" + expiryDate + '\'' +
                ", weight=" + weight +
                '}';
    }
}