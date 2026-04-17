package ch07.sec07.polymorphism;

//클린코딩 예제
public class CarExample1 {
    public static void main(String[] args) {
        Car1 car = new Car1();

        for(int i = 0; i<=5; i++) {
            int problemLocation = car.run();
            if(problemLocation != 0){
                System.out.println(car.tires[problemLocation-1].location + " HankookTire로 교체");
                car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation-1].location, 15);
            }
            System.out.println("------------------------------------");
        }
    }
}
