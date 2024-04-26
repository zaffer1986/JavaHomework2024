package main.java.Homework.task1.Task7;

import java.util.List;

public class Kitchen implements Cookable{
    private List<Chef> chefs;
    private List<Order> cookingOrders;
    boolean isOpen;

    public Kitchen(List<Chef> chefs, List<Order> cookingOrders, boolean isOpen) {
        this.chefs = chefs;
        this.cookingOrders = cookingOrders;
        this.isOpen = isOpen;
    }

    public List<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(List<Chef> chefs) {
        this.chefs = chefs;
    }

    public List<Order> getCookingOrders() {
        return cookingOrders;
    }

    public void setCookingOrders(List<Order> cookingOrders) {
        this.cookingOrders = cookingOrders;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "chefs=" + chefs +
                ", cookingOrders=" + cookingOrders +
                ", isOpen=" + isOpen +
                '}';
    }

    @Override
    public void prepareDish(MenuItem item) {
        for (Chef orders:chefs) {
            orders.prepareDish(item);
        }
        System.out.println("Dish started for "+item.getName());
    }

    @Override
    public void completeDish(MenuItem item) {
        for (Order orders:cookingOrders) {
            if (orders.getOrderedItems().equals(item)){
                cookingOrders.remove(orders);
                System.out.println("Dish is complete "+item.getName());
                return;
            }
        }
    }
}
