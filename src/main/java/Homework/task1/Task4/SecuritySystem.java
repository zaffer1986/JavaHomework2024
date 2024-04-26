package Homework.task1.Task4;

import java.time.LocalDateTime;
import java.util.Arrays;

public class SecuritySystem extends Device implements Security{
    private boolean isArmed;
    private String[] accessCodes;
    public SecuritySystem(String deviceId, String location, boolean isOn, LocalDateTime lastChecked,boolean isArmed,String [] accessCodes) {
        super(deviceId, location, isOn, lastChecked);
        this.accessCodes=new String[5];
        this.isArmed=false;
    }

    public boolean isArmed() {
        return isArmed;
    }

    public void setArmed(boolean armed) {
       this.isArmed=armed;
    }

    public String[] getAccessCodes() {
        return accessCodes;
    }

    public void setAccessCodes(String[] accessCodes) {
        this.accessCodes = accessCodes;
    }

    @Override
    public void armSystem(String code) {
        if (!isArmed){
            System.out.println(code);
        }else
            System.out.println("its off");
    }

    @Override
    public void disarmSystem(String code) {
        if (isArmed){
            System.out.println(code);
        }else
            System.out.println("its off");
    }

    @Override
    public void supervise() {
        if(accessCodes[accessCodes.length-1]!=null){
        System.out.println("Code access");
        }else
        for (int i = 0; i <accessCodes.length ; i++) {
            if (accessCodes[i] == null) {
                accessCodes[i] = "2535";
                System.out.println("code is added");
                break;

            }
        }
    }

    @Override
    public void recording () {
        System.out.println("Evertyhing is recorf=ding by video device");
    }

    @Override
    public String toString () {
        return "SecuritySystem{" +
                "isArmed=" + isArmed +
                ", accessCodes=" + Arrays.toString(accessCodes) +
                '}';
    }



}
