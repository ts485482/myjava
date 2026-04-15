package ch06.sec04;

public class CalculatorExample {
    public static void main(String[] args) {
        //클래스 내부에서 메소드 호출 예제

        
        Calculator myCal = new Calculator();
        myCal.execite();

        int result1 = myCal.plus(0, 0);
        double result2 = myCal.plus(0, 0.5);
        double result3 = myCal.plus(0.5, 0);
        double result4 = myCal.plus(0.5, 0.5);

        System.out.println("result1 ( int + int ) : " + result1);
        System.out.println("result2 ( int + double ) : " + result2);
        System.out.println("result3 ( double + double ) : " + result3);
        System.out.println("result4 ( double + double ) : " + result4);
    }
}
