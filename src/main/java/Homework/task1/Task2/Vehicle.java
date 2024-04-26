package Homework.task1.Task2;

 abstract class Vehicle {
     private String model;
     private int capacity;
     private double fare;
     private String route;

     public Vehicle(String model, int capacity, double fare, String route) {
         this.model = model;
         this.capacity = capacity;
         this.fare = fare;
         this.route = route;
     }

     public String getModel() {
         return model;
     }

     public int getCapacity() {
         return capacity;
     }

     public double getFare() {
         return fare;
     }

     public String getRoute() {
         return route;
     }

     public void setModel(String model) {
         this.model = model;
     }

     public void setCapacity(int capacity) {
         this.capacity = capacity;
     }

     public void setFare(double fare) {
         this.fare = fare;
     }

     public void setRoute(String route) {
         this.route = route;
     }

     abstract public  void move();

     abstract public void servicetoPeople();

     abstract public void driving();



}
