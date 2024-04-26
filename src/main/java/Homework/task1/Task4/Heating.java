package Homework.task1.Task4;

import java.time.LocalDateTime;

public class Heating extends Device implements ControlInterface{

    private double currentTemperature;
    private double targetTemperature;

    public Heating(String deviceId, String location, boolean isOn, LocalDateTime lastChecked,double currentTemperature,double targetTemperature) {
        super(deviceId, location, isOn, lastChecked);
        this.currentTemperature=currentTemperature;
        this.targetTemperature=targetTemperature;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public void setCurrentTemperature(double currentTemperature) {
        this.currentTemperature = currentTemperature;
    }

    public double getTargetTemperature() {
        return targetTemperature;
    }

    public void setTargetTemperature(double targetTemperature) {
        this.targetTemperature = targetTemperature;
    }


    @Override
    public void turnOn() {
        currentTemperature=25;
        targetTemperature=25;
        if(currentTemperature<20){
            System.out.println("its hot-turn off");
        }else if(targetTemperature>15){
            System.out.println("its cold-turn on");
        }else
            System.out.println("nothing");
        System.out.println("The Heating system with number "+getDeviceId()+" and location "+getLocation()+" "+isOn()+" with local time "+
                getLastChecked()+" is On with "+this.currentTemperature);

    }

    @Override
    public void turnOff() {
        if(currentTemperature>20){
            System.out.println("its hot-turn off");
        }else if(targetTemperature<15){
            System.out.println("its cold-turn on");
        }else
            System.out.println("nothing");
        System.out.println("The Heating system with number "+getDeviceId()+" and location "+getLocation()+" "+isOn()+" with local time "+
                getLastChecked()+" is Off with less than "+this.targetTemperature);

    }

    @Override
    public void getStatus() {

    }

    @Override
    public void supervise() {
        System.out.println("The heating system is controlling by special device equipment");

    }

    @Override
    public void recording() {
        System.out.println("And also the modern device is recording all passing dates");

    }

    @Override
    public String toString() {
        return "Heating{" +
                "currentTemperature=" + currentTemperature +
                ", targetTemperature=" + targetTemperature +
                '}';
    }
}
