package Homework.task1.Task2;

public class Tram extends Vehicle implements TransportControl,Maintance{
    private int trackWidth;
    private boolean electric;



   public Tram(String model, int capacity, double fare, String route, int trackWidth) {
        super(model, capacity, fare, route);
        this.trackWidth=trackWidth;
    }

    public int getTrackWidth() {
        return trackWidth;
    }

    public void setTrackWidth(int trackWidth) {
        this.trackWidth = trackWidth;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    @Override
    public void move() {
        System.out.println("The trams are always moving in directly tracks in "+this.trackWidth+" meter");

    }

    @Override
    public void servicetoPeople() {
        System.out.println("Trams servicing people in the big and middle cities with low fare "+getFare()+" euro");

    }

    @Override
    public void driving() {
        System.out.println("Trams have defining rotes as: "+getRoute() +" or"+getRoute());

    }


    @Override
    public void RoadInfrastructurePlanning() {
        System.out.println("Trams has planning road infrastructure as "+this.trackWidth);
    }

    @Override
    public void TrafficSignalsandSigns() {
        System.out.println("During moving trams using their traffic signals and signs");

    }

    @Override
    public void RoadMarkings() {
        System.out.println("During road constructions trams should know the special constructions signs");

    }

    @Override
    public void TrafficPoliceandLawEnforcement() {
        System.out.println("Drivers of trams alwasys are in contact with police law enforcement");

    }


    @Override
    public String toString() {
        return "Tram{" +
                "trackWidth=" + trackWidth +
                ", electric=" + electric +
                '}';
    }
}
