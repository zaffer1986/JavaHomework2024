package Homework.task1.Task4;

import java.time.LocalDateTime;

public class Lighting extends Device implements ControlInterface{

    private int brightnessLevel;
    private String colorTemperature;

    public Lighting(String deviceId, String location, boolean isOn, LocalDateTime lastChecked,int brightnessLevel,String colorTemperature) {
        super(deviceId, location, isOn, lastChecked);
        this.brightnessLevel=brightnessLevel;
        this.colorTemperature=colorTemperature;
    }


    @Override
    public void turnOn() {
    if (brightnessLevel<5){
        System.out.println("its on");
    }else
        System.out.println("its off");

    }

    @Override
    public void turnOff() {
        if (brightnessLevel>5){
            System.out.println("its off");
        }else
            System.out.println("its on");
    }

    @Override
    public void getStatus() {

    }

    @Override
    public void supervise() {
        System.out.println("The lighting system is controling by switches and panel control");

    }

    @Override
    public void recording() {
        System.out.println("the device of lighting depends from current switchboard");

    }

    @Override
    public String toString() {
        return "Lighting{" +
                "brightnessLevel=" + brightnessLevel +
                ", colorTemperature='" + colorTemperature + '\'' +
                '}';
    }
}
