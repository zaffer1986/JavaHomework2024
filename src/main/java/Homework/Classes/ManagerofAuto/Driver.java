package Homework.Classes.ManagerofAuto;
/*одитель (Driver)
        Поля: имя, стаж вождения, текущий автомобиль (Car).
        Методы: назначить автомобиль, освободить автомобиль.
*/
public class Driver {
    private String name;
    private int skillofdriving;
    private Car currentcar;

    public Driver(String name, int skillofdriving, Car currentcar) {
        this.name = name;
        this.skillofdriving = skillofdriving;
        this.currentcar = currentcar;
    }

    public void assignCar(Car car){
        System.out.println("Name of driver "+this.name+car);
    }
    public void releaseCar(){
        System.out.println("Release car "+this.name);
    }
}
