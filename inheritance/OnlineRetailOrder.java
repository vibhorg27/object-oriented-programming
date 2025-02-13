package com.bridgelabz.inheritance;

class Order{
    protected String orderId;
    protected String orderDate;

    public Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public void getOrderStatus(){
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }

}

class ShippedOrder extends Order{
    protected String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder{
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
    }
}

public class OnlineRetailOrder {
    public static void main(String[] args) {
        // Step 1: Order is placed
        Order order = new Order("101", "2025-02-14");
        order.getOrderStatus();
        System.out.println();

        // Step 2: Order is shipped
        ShippedOrder shipped = new ShippedOrder("102", "2025-02-14", "TN12345");
        shipped.getOrderStatus();
        System.out.println();

        // Step 3: Order is delivered
        DeliveredOrder delivered = new DeliveredOrder("103", "2025-02-14", "TN56789", "2025-02-16");
        delivered.getOrderStatus();
        System.out.println();

    }
}

