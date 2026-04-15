package ch06.sec05;

public class Car {
    //정적 메소드와 블록 선언 시 주의점 (지양하는 방식)
    //예제이기 때문에 나올 수 있는 코드
    
    int speed;

    void run(){
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
