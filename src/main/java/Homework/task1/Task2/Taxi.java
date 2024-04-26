package Homework.task1.Task2;

public class Taxi extends Vehicle implements TransportControl,Maintance{

    private  String licensePlate;
    private boolean available;


    public Taxi(String model, int capacity, double fare, String route,String licensePlate) {
        super(model, capacity, fare, route);
        this.licensePlate=licensePlate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public void move() {
        System.out.println("The taxi with "+getModel()+" "+getCapacity()+" moving inside the city");

    }

    @Override
    public void servicetoPeople() {
        System.out.println("Taxi service always people with defined payment tariffs "+getFare()+" euro/km");

    }

    @Override
    public void driving() {
        System.out.println("Taxi workers deiving with special "+this.licensePlate);

    }

    public void  workingbyorders(){
        if (this.available==false){
            System.out.println("is available");
        }else
        System.out.println("having rest");
    }

    @Override
    public void RoadInfrastructurePlanning() {
        System.out.println("Alwasys are getting news from traffic planning");

    }

    @Override
    public void TrafficSignalsandSigns() {
        System.out.println("Taxers are always should know about the traffic signs and signals");

    }

    @Override
    public void RoadMarkings() {
        System.out.println("During the repair or accident driver of taxi should use roadmarking signs");
    }

    @Override
    public void TrafficPoliceandLawEnforcement() {
        System.out.println("Always be in law enforcement rules");
    }


    @Override
    public String toString() {
        return "Taxi{" +
                "licensePlate='" + licensePlate + '\'' +
                ", available=" + available +
                '}';
    }
}
