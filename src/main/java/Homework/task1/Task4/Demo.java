package Homework.task1.Task4;

import java.time.LocalDateTime;

public class Demo {
    public static void main(String[] args) {
        String[] codess={"25566","58945","25662","5896965"};
        SecuritySystem securitySystem=new SecuritySystem("2252155","house",true, LocalDateTime.now(),true,codess);
        securitySystem.armSystem("2524");
        securitySystem.disarmSystem("2323");
        securitySystem.supervise();
        Heating heating= new Heating("2525","house",true,LocalDateTime.now(),25.5,30);
        heating.turnOn();
        heating.turnOff();
        Device[] devicesHome={securitySystem,heating};
        boolean smarthome=true;
        SmartHome smartHome=new SmartHome("Home",devicesHome, smarthome,LocalDateTime.now());
        smartHome.turnOn();
        smartHome.turnOff();
        smartHome.armSystem("555");
        smartHome.disarmSystem("222");


    }
}
