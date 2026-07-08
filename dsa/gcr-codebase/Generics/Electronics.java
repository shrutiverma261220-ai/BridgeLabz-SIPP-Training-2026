public class Electronics extends WarehouseItem {

    private String brand;
    private int warrantyYears;

    public Electronics(int itemId, String itemName, double price,
                       String brand, int warrantyYears) {
        super(itemId, itemName, price);
        this.brand = brand;
        this.warrantyYears = warrantyYears;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyYears() {
        return warrantyYears;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyYears(int warrantyYears) {
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayDetails() {
        System.out.println("===== Electronics Item =====");
        System.out.println("Item ID        : " + getItemId());
        System.out.println("Item Name      : " + getItemName());
        System.out.println("Price          : ₹" + getPrice());
        System.out.println("Brand          : " + brand);
        System.out.println("Warranty       : " + warrantyYears + " Years");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Electronics{" +
                "itemId=" + getItemId() +
                ", itemName='" + getItemName() + '\'' +
                ", price=" + getPrice() +
                ", brand='" + brand + '\'' +
                ", warrantyYears=" + warrantyYears +
                '}';
    }
}



