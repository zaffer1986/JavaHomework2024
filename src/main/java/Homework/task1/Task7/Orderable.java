package main.java.Homework.task1.Task7;

import java.util.List;

public interface Orderable {
    void placeOrder(List<MenuItem> items);
    void cancelOrder(int orderId);
    void updateOrder(int orderId, List<MenuItem> newItems);
}
