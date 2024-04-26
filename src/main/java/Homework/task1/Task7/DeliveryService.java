package main.java.Homework.task1.Task7;

import java.util.List;

public class DeliveryService implements Deliverable{
    private List<DeliveryPerson> deliveryPeople;
    private List<Order> deliveryQueue;
    private boolean isOperational;

    public DeliveryService(List<DeliveryPerson> deliveryPeople, List<Order> deliveryQueue, boolean isOperational) {
        this.deliveryPeople = deliveryPeople;
        this.deliveryQueue = deliveryQueue;
        this.isOperational = isOperational;
    }

    public List<DeliveryPerson> getDeliveryPeople() {
        return deliveryPeople;
    }

    public void setDeliveryPeople(List<DeliveryPerson> deliveryPeople) {
        this.deliveryPeople = deliveryPeople;
    }

    public List<Order> getDeliveryQueue() {
        return deliveryQueue;
    }

    public void setDeliveryQueue(List<Order> deliveryQueue) {
        this.deliveryQueue = deliveryQueue;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    @Override
    public String toString() {
        return "DeliveryService{" +
                "deliveryPeople=" + deliveryPeople +
                ", deliveryQueue=" + deliveryQueue +
                ", isOperational=" + isOperational +
                '}';
    }

    @Override
    public void startDelivery(Order order) {
    }

    @Override
    public void completeDelivery(Order order) {

    }
}
