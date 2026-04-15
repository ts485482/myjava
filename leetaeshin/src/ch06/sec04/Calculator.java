package ch06.sec04;

public class Calculator {
    //클래스 내부에서 메소드 호출 예제


    //필드
    //생성자
    //메소드
    int plus(int x, int y){
        return x + y;
    }

    //오버로딩 (같은 이름의 메소드를 여러개 선언)
    //오버로딩 조건 : 매개변수의 타입, 개수, 순서가 달라야함
    
    double plus(double x, int y){
        return x + y;
    }
    double plus(int x, double y){
        return x + y;
    }
    double plus(double x, double y){
        return x + y;
    }
    
    double avg(int x, int y){
        double sum = plus(x,y);
        double result = sum / 2;
        return result;
    }

    void execite(){
        double result = avg(7,10);
        println("실행결과 : " + result);
    }

    void println(String message){
        System.out.println(message);
    }
}
