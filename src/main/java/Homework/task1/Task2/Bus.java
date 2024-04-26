package Homework.task1.Task2;

 public class Bus extends Vehicle implements TransportControl,Maintance{

     private boolean accessibility;
    private int busNumber;

    public Bus(String model, int capacity, double fare, String route,int busNumber) {
         super(model, capacity, fare, route);
         this.busNumber=busNumber;

     }

     @Override
    public void move() {
        System.out.println("Buses with "+getModel()+" and capacity "+getCapacity()+" are always moving with graghics numbers "+this.busNumber);
    }

     @Override
     public void servicetoPeople() {
        if (this.accessibility==false){
            System.out.println("The bus in the line");
        }else
            System.out.println("Not in the line");
     }

     @Override
     public void driving() {
         System.out.println("Buses driving with defined routes "+getRoute()+" and "+this.busNumber);

     }


     @Override
     public void RoadInfrastructurePlanning() {
         System.out.println("Always planning with road infrastructure");

     }

     @Override
     public void TrafficSignalsandSigns() {
         System.out.println("Always using traffics signs and signals");

     }

     @Override
     public void RoadMarkings() {
         System.out.println("Always should know the road markings");

     }

     @Override
     public void TrafficPoliceandLawEnforcement() {
         System.out.println("Should know and using during accidents police law enforcement");

     }

     public boolean isAccessibility() {
         return accessibility;
     }

     public void setAccessibility(boolean accessibility) {
         this.accessibility = accessibility;
     }

     public int getBusNumber() {
         return busNumber;
     }

     public void setBusNumber(int busNumber) {
         this.busNumber = busNumber;
     }

     @Override
     public String toString() {
         return "Bus{" +
                 "accessibility=" + accessibility +
                 ", busNumber=" + busNumber +
                 '}';
     }
 }
