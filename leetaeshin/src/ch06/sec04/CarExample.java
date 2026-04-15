package ch06.sec04;

public class CarExample {
    public static void main(String[] args) {
        //인스턴스 멤버와 this

        
        Car mycar = new Car("포르쉐");
        Car yourCar = new Car("메르세데스");

        mycar.run();
        yourCar.run();
    }
}
