package Homework.task1.Task4;

import java.time.LocalDateTime;

public class SmartHome implements Security,ControlInterface{
    private String homeName;
    private Device[] devices;
    private boolean isAwayMode;
    private LocalDateTime lastUpdate;

    public SmartHome(String homeName, Device[] devices, boolean isAwayMode, LocalDateTime lastUpdate) {
        this.homeName = homeName;
        this.devices = new Device[3];
        this.isAwayMode = false;
        this.lastUpdate = lastUpdate;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public Device[] getDevices() {
        return devices;
    }

    public void setDevices(Device[] devices) {
        this.devices = devices;
    }

    public boolean isAwayMode() {
        return isAwayMode;
    }

    public void setAwayMode(boolean awayMode) {
        isAwayMode = awayMode;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public void turnOn() {
        isAwayMode=false;
        System.out.println("When the owner is on the house, all devices are working");

//
    }
    @Override
    public void turnOff() {
        isAwayMode=true;
        System.out.println("The owner is out off home");
    }

    @Override
    public void getStatus() {

    }

    @Override
    public void armSystem(String code) {
        Device[] devicehome=new Device[devices.length];
        for (int i = 0; i <devices.length ; i++) {
            if(devicehome[i]==null) {
                System.out.println("The owner is at home "+code);
            } else
                System.out.println("the owner is out");

        }
    }

    @Override
    public void disarmSystem(String code) {
        Device[] devicehome=new Device[devices.length];
        for (int i = 0; i <devices.length ; i++) {
            if(devicehome[i]!=null){
                System.out.println("The owner is at home " +code);
            }else
                    System.out.println("the owner is out "+code);

        }

    }
}
