package main.java.Homework.task1.Task7;

import java.util.List;

public class DeliveryPerson implements Deliverable{
    private String name;
    private String vehicleType;
    private boolean isAvailable;
    private List<Order> currentDeliveries;

    public DeliveryPerson(String name, String vehicleType, boolean isAvailable, List<Order> currentDeliveries) {
        this.name = name;
        this.vehicleType = vehicleType;
        this.isAvailable = isAvailable;
        this.currentDeliveries = currentDeliveries;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public List<Order> getCurrentDeliveries() {
        return currentDeliveries;
    }

    public void setCurrentDeliveries(List<Order> currentDeliveries) {
        this.currentDeliveries = currentDeliveries;
    }

    @Override
    public void startDelivery(Order order) {
        currentDeliveries.add(order);
        System.out.println("Start delivery "+order);
    }

    @Override
    public void completeDelivery(Order order) {
    if (currentDeliveries.contains(order)){
        order.getOrderedItems();
        System.out.println("Order is complete "+order.getOrderId());
    }else
        System.out.println("Order not found");
    }
}
