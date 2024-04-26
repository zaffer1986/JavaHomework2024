package Homework.task1.Task2;

public class VehicleDemo {
    public static void main(String[] args) {
        Taxi taxi=new Taxi("Tayota",2520,1,"From a to b","taxi");
        Bus bus=new Bus("Man",5050,1.0,"From b to c",250);
        Tram tram= new Tram("Man",4152,1.0,"From k to m",2);
        Vehicle[] vehicles={taxi,bus,tram};
        for (Vehicle x:vehicles ) {
            x.move();
            x.driving();
            x.servicetoPeople();
        }
        TransportManager transportManager=new TransportManager(vehicles,500,"Black");
        transportManager.totalVehicles(taxi);
        transportManager.RoadMarkings();
        transportManager.TrafficPoliceandLawEnforcement();
        transportManager.TrafficSignalsandSigns();
        bus.servicetoPeople();
        taxi.workingbyorders();

}
}
