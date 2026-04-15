package ch06.sec03;

public class Car {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    //각각 인스턴스 객체로, 각각의 주소값이 다 다름
    Car(){        
    }

    Car(String model){
        //this.model = model;
        
        //아래에 있는 Car(String model, String color, int maxSpeed) 에게 떠넘김
        this(model,null,0);
    }

    Car(String model, String color){
        //this.model = model;
        //this.color = color;
        
        //아래에 있는 Car(String model, String color, int maxSpeed) 에게 떠넘김
        this(model,color,0);
    }

    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
