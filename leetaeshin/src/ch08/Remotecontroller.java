package ch08;

public class Remotecontroller {
    public static void main(String[] args) {
        Remotecontrol rc;
        rc = new Television();
        rc.turnOn();
        rc.setMute(true);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true);
        rc.turnOff();

        Remotecontrol.changeBattery();
    }
}
