package ch08;

public class Remotecontroller {
    public static void main(String[] args) {
        Remotecontrol rc;
        rc = new Television();
        rc = new Audio();

        Remotecontrol.changeBattery();
    }
}
