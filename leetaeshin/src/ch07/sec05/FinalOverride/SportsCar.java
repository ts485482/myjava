package ch07.sec05.FinalOverride;

public class SportsCar extends Car{
    @Override
    public void speedUp(){
        speed += 10;
    }

    //final 메소드는 오버라이딩 불가능
    /*
    @Override
    public void stop(){
        System.out.println("스포츠카를 멈춤");
        seppd = 0;
    }
    */
}
