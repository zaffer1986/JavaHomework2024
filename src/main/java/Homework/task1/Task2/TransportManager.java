package Homework.task1.Task2;

import java.util.Arrays;

public class TransportManager implements TransportControl{
   private Vehicle[] vehicles;
   private int totalVehicles;
   private String managerName;

    public TransportManager(Vehicle[] vehicles, int totalVehicles, String managerName) {
        this.vehicles = vehicles;
        this.totalVehicles = totalVehicles;
        this.managerName = managerName;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public int getTotalVehicles() {
        return totalVehicles;
    }

    public void setTotalVehicles(int totalVehicles) {
        this.totalVehicles = totalVehicles;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void totalVehicles(Vehicle vehicle){
        Vehicle[] vehicles1=new Vehicle[vehicles.length];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles1[i]=vehicles[i];
            System.out.println(vehicles1[i]);
        }
    }

    @Override
    public void TrafficSignalsandSigns() {
        System.out.println("Manager "+this.managerName+" should know about the signs and signals traffics");

    }

    @Override
    public void RoadMarkings() {
        System.out.println("Manager " +this.managerName+" should know the road markings");

    }

    @Override
    public void TrafficPoliceandLawEnforcement() {
        System.out.println("Manager "+this.managerName+" be in contact with police and " +
                "transport drivers and controling around minimum "+this.totalVehicles+" vehicles");

    }

    @Override
    public String toString() {
        return "TransportManager{" +
                "vehicles=" + Arrays.toString(vehicles) +
                ", totalVehicles=" + totalVehicles +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
