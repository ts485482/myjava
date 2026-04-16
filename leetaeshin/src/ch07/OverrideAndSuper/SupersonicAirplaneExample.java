package ch07.OverrideAndSuper;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        //SUPERSONIC - static int형
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        //NORMAL - static int형
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
