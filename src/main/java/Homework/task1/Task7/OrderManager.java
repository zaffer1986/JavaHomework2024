package main.java.Homework.task1.Task7;

import java.util.List;

public class OrderManager implements Orderable{
    private List<Order> pendingOrders;
    private Kitchen kitchen;
    private DeliveryService deliveryService;

    public OrderManager(List<Order> pendingOrders, Kitchen kitchen, DeliveryService deliveryService) {
        this.pendingOrders = pendingOrders;
        this.kitchen = kitchen;
        this.deliveryService = deliveryService;
    }

    public List<Order> getPendingOrders() {
        return pendingOrders;
    }

    public void setPendingOrders(List<Order> pendingOrders) {
        this.pendingOrders = pendingOrders;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public DeliveryService getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    @Override
    public String toString() {
        return "OrderManager{" +
                "pendingOrders=" + pendingOrders +
                ", kitchen=" + kitchen +
                ", deliveryService=" + deliveryService +
                '}';
    }

    @Override
    public void placeOrder(List<MenuItem> items) {
        for (Order orders:pendingOrders) {
            orders.setOrderedItems(items);
            pendingOrders.add(orders);
            kitchen.setCookingOrders(pendingOrders);
        }


    }

    @Override
    public void cancelOrder(int orderId) {
        for (Order cancel:pendingOrders) {
            if (cancel.getOrderId()==orderId){
                pendingOrders.remove(orderId);
                return;
            }
            System.out.println(" Order is not found "+orderId);
        }
    }

    @Override
    public void updateOrder(int orderId, List<MenuItem> newItems) {
        for (Order update:pendingOrders) {
            if (update.getOrderId()==orderId){
                update.setOrderedItems(newItems);
                return;
            }
            System.out.println(" not found "+orderId);
        }
    }

}
