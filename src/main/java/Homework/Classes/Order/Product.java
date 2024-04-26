package Homework.Classes.Order;
/*Система Управления Заказами
        Классы:
        Товар (Product)
        Поля: название, цена, количество на складе.
        Методы: проверка наличия, обновление количества на складе.
*/

public class Product {
    private String name;
    private int price;
    private int quantityinWarhouse;

    public Product(String name, int price, int quantityyinWarhouse) {
        this.name = name;
        this.price = price;
        this.quantityinWarhouse = quantityyinWarhouse;
    }



    public void CheckAvailabillityofGoods(Product goods){
        System.out.println("Checking goods: "+" "+goods);
    }
    public void  updatingthequantityinstock(Product  quantity){
        System.out.println("Updating quantity: " +this.quantityinWarhouse+" pieces" + " "+quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityinWarhouse=" + quantityinWarhouse +
                '}';
    }
}
