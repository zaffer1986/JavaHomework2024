package Homework.task1.Task4;

import java.time.LocalDateTime;

 abstract class Device {
    private String deviceId;
    private String location;
    private boolean isOn;
    private LocalDateTime lastChecked;

     public Device(String deviceId, String location, boolean isOn, LocalDateTime lastChecked) {
         this.deviceId = deviceId;
         this.location = location;
         this.isOn = isOn;
         this.lastChecked = lastChecked;
     }

     public String getDeviceId() {
         return deviceId;
     }

     public void setDeviceId(String deviceId) {
         this.deviceId = deviceId;
     }

     public String getLocation() {
         return location;
     }

     public void setLocation(String location) {
         this.location = location;
     }

     public boolean isOn() {
         return isOn;
     }

     public void setOn(boolean on) {
         isOn =on;
     }

     public LocalDateTime getLastChecked() {
         return lastChecked;
     }

     public void setLastChecked(LocalDateTime lastChecked) {
         this.lastChecked = lastChecked;
     }

     abstract public void supervise();

     abstract public void recording();

 }
