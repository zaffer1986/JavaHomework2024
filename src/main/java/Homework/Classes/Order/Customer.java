package Homework.Classes.Order;

/*      Клиент (Customer)
        Поля: имя, email, история заказов (массив).
        Методы: сделать заказ, отменить заказ.
*/

public class Customer {
    private String name;
    private String email;
    private Order historyoforders;

    public Customer(String name, String email, Order historyoforders) {
        this.name = name;
        this.email = email;
        this.historyoforders = historyoforders;
    }

    public  static void makeorder(){
        System.out.println();
    }
    public static void cancelorder(){
        System.out.println();
    }
}
