package main.java.Homework.task1.Task7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Order implements Orderable{
    private int orderId;
    private Customer customer;
    private List<MenuItem> orderedItems;
    private double totalCost;


    public Order(int orderId, Customer customer, List<MenuItem> orderedItems, double totalCost) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderedItems = orderedItems;
        this.totalCost = totalCost;

    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<MenuItem> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(List<MenuItem> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", orderedItems=" + orderedItems +
                ", totalCost=" + totalCost +
                ", status="  +
                '}';
    }

    @Override
    public void placeOrder(List<MenuItem> items) {
        for (MenuItem ggg:items){
            System.out.println(ggg.getIngredients());
        }
    }

    @Override
    public void cancelOrder(int orderId) {
        List<Order> cancel=new ArrayList<>();
        cancel.remove(orderId);
        System.out.println(cancel);
    }

    @Override
    public void updateOrder(int orderId, List<MenuItem> newItems) {
        Order update=null;
        List<Order> updateorder=new ArrayList<>();
        for (Order orders:updateorder) {
            if (orders.orderId==orderId){
                update=orders;
                break;
            }
        }
        if (update==null){
            System.out.println("Order is not found "+orderId);
        }
        update.setOrderedItems(newItems);
        System.out.println("Order is succesfully "+orderId+" updated");
    }
}
