package Homework.Classes.Order;

public class ProductDemo {
    public static void main(String[] args) {

        Product product=new Product("A",200,2000);
        System.out.println(product);
        product.CheckAvailabillityofGoods(product);
        product.updatingthequantityinstock(product);

        Order order=new Order(product,"bought",100);
        System.out.println(order);
        int [] quantityofgoods=new int[10];
        order.addproducttoOrder(quantityofgoods);
    }
}
