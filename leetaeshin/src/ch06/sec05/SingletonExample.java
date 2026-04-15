package ch06.sec05;

public class SingletonExample {
    public static void main(String[] args) {
        //싱글톤 작업
        //같은 객체의 주소를 반환해주기 위한 작업

        /*
        Singleton obj1 = new Singleton();       //컴파일 에러
        Singleton obj2 = new Singleton();       //컴파일 에러
        */

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else{
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
