public class Furniture extends WarehouseItem {

    private String material;
    private double weight;

    public Furniture(int itemId, String itemName, double price,
                     String material, double weight) {
        super(itemId, itemName, price);
        this.material = material;
        this.weight = weight;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void displayDetails() {
        System.out.println("===== Furniture Item =====");
        System.out.println("Item ID      : " + getItemId());
        System.out.println("Item Name    : " + getItemName());
        System.out.println("Price        : ₹" + getPrice());
        System.out.println("Material     : " + material);
        System.out.println("Weight       : " + weight + " kg");
        System.out.println();
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "itemId=" + getItemId() +
                ", itemName='" + getItemName() + '\'' +
                ", price=" + getPrice() +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                '}';
    }
}