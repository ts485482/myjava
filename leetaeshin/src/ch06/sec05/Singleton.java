package ch06.sec05;

public class Singleton {
    //싱글톤 작업
    //같은 객체의 주소를 반환해주기 위한 작업

    //private - 은닉성
    //외부에서 Singleton a = new Singleton(); 으로 호출 불가능함.
    private static Singleton singleton = new Singleton();
    
    //생성자 은닉성
    private Singleton(){}

    //외부 호출 시, Singleton.getInstance(); 로만 호출 가능하게 만듦(주소 동일)
    static Singleton getInstance(){
        return singleton;
    }
}
