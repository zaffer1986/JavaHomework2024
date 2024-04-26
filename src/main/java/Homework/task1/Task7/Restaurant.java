package main.java.Homework.task1.Task7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Restaurant {
    private String name;
    private Menu menu;
    private List<Order> orders;
    private HashMap<Integer, Customer> customers;

    public Restaurant(String name, Menu menu, List<Order> orders, HashMap<Integer, Customer> customers) {
        this.name = name;
        this.menu = menu;
        this.orders = new ArrayList<>();
        this.customers = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public HashMap<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(HashMap<Integer, Customer> customers) {
        this.customers = customers;
    }

    public  void addCustomer(Customer customer){
        customers.put(customer.getCustomerId(),customer);
        System.out.println(customers);
    }
    public void removeCustomer(int customerid){
        customers.remove(customerid);
        System.out.println(customers);
    }
    public  void placeOrder(List<MenuItem> order){
        for (MenuItem plcaeorder: order) {
            System.out.println(plcaeorder.getIngredients());
        }
    }
    public  void getMenu(Menu menutable){
        System.out.println(menutable.getDescription());
    }
    public void getCustomerInformation(){
        for (Map.Entry<Integer,Customer> e:customers.entrySet()) {
            System.out.println("The Id "+e.getKey()+" customer "+e.getValue());
        }
    }
}
