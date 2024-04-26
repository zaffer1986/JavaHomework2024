package Homework.Classes.ManagerofAuto;
/*Система Управления Транспортным Парком
        Классы:
        Автомобиль (Car)
        Поля: марка, модель, год выпуска.
        Методы: вывод информации об автомобиле, проверка на техосмотр.
*/
public class Car {
    private String mark;
    private String model;
    private int madeof;

    public Car(String mark, String model, int madeof) {
        this.mark = mark;
        this.model = model;
        this.madeof = madeof;
    }

    public void infoaboutCar(){
        System.out.println("Information about car "+this.mark+" "+this.model+" "+this.madeof);
    }
    public void checktechnik(){
        System.out.println("Car for checking: "+this.model+" "+this.madeof);
    }


}
