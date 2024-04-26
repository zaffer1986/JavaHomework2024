package Homework.Classes.ManagerofAuto;
 /*Менеджер Парка (FleetManager)
         Поля: имя, список автомобилей (массив), список водителей (массив).
         Методы: добавить автомобиль в парк, назначить автомобиль водителю.
*/
public class FleetManager {
 private String name;
 private Car[] cars;
 private Driver[] drivers;

  public FleetManager(String name, Car[] cars, Driver[] drivers) {
   this.name = name;
   this.cars = cars;
   this.drivers = drivers;
  }

  public void addcarinFleet(Car[] cars){
  Car[] cars1=new Car[cars.length];
  for (int i = 0; i <cars.length ; i++) {
   cars[i]=cars1[i];
   System.out.println(cars1[i]);
  }

 }
 public void relesecartoDriver(Driver[] drivers){
  Driver[] drivers1=new Driver[drivers.length];
  for (int i = 0; i <drivers.length ; i++) {
   drivers[i]=drivers1[i];
   System.out.println(drivers1);

  }
 }
}
