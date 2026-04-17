package ch07.sec07.polumorphism_Class;

public class Taxi extends Vehicle {
    @Override
    public void run(){
        System.out.println("택시가 달립니다.");
    }
}
