class RetailOrder {
    int orderId;
    String orderDate;

    RetailOrder(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class RetailShippedOrder extends RetailOrder {
    String trackingNumber;

    RetailShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class RetailDeliveredOrder extends RetailShippedOrder {
    String deliveryDate;

    RetailDeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OnlineRetailOrderManagement {

    public static void main(String[] args) {

        RetailOrder order = new RetailOrder(101, "24-06-2026");
        RetailShippedOrder shipped = new RetailShippedOrder(
                102,
                "24-06-2026",
                "TRK12345"
        );
        RetailDeliveredOrder delivered = new RetailDeliveredOrder(
                103,
                "24-06-2026",
                "TRK67890",
                "26-06-2026"
        );

        System.out.println("Order ID : " + order.orderId);
        System.out.println("Status : " + order.getOrderStatus());

        System.out.println();

        System.out.println("Order ID : " + shipped.orderId);
        System.out.println("Tracking Number : " + shipped.trackingNumber);
        System.out.println("Status : " + shipped.getOrderStatus());

        System.out.println();

        System.out.println("Order ID : " + delivered.orderId);
        System.out.println("Tracking Number : " + delivered.trackingNumber);
        System.out.println("Delivery Date : " + delivered.deliveryDate);
        System.out.println("Status : " + delivered.getOrderStatus());
    }
}