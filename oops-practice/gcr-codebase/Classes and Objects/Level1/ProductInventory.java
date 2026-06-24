public class ProductInventory {

    // Instance Variables
    String productName;
    double price;

    // Class Variable
    static int totalProducts = 0;

    // Constructor
    ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance Method
    void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println();
    }

    // Class Method
    static void displayTotalProducts() {
        System.out.println("Total Products Created : " + totalProducts);
    }

    // Main Method
    public static void main(String[] args) {

        ProductInventory p1 = new ProductInventory("Laptop", 55000);
        ProductInventory p2 = new ProductInventory("Mouse", 800);
        ProductInventory p3 = new ProductInventory("Keyboard", 1500);

        System.out.println("----- Product Details -----");
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();

        System.out.println("----- Total Products -----");
        ProductInventory.displayTotalProducts();
    }
}