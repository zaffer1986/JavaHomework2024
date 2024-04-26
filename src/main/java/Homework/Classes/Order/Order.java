package Homework.Classes.Order;
/*Заказ (Order)
        Поля: список товаров (массив), статус заказа, общая сумма.
        Методы: добавить товар в заказ, рассчитать общую сумму.

 */
public class Order {
    private Product listofgoods;
    private String statusoforder;
    private int totalsum;

    public Order(Product listofgoods, String statusoforder, int totalsum) {
        this.listofgoods = listofgoods;
        this.statusoforder = statusoforder;
        this.totalsum = totalsum;
    }

    public  void  addproducttoOrder(int[] goods){
        int good=100;
        for (int i = 0; i <goods.length ; i++) {
            goods[i]=good;
            System.out.println(goods[i]);
        }

        //System.out.println("Add product to order "+ "" +listofgoods);
    }
    public  void calculateTotalSum(){
        System.out.println("Calculate total sum " + this.totalsum);
    }

    @Override
    public String toString() {
        return "Order{" +
                "listofgoods=" + listofgoods +
                ", statusoforder='" + statusoforder + '\'' +
                ", totalsum=" + totalsum +
                '}';
    }
}
