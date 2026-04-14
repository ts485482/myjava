package ch02.sec02;

public class Ex08_Promotion {
    public static void main(String[] args) {
        //작은 크기 타입 > 큰 크기 타입 : 자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue : "+intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("가의 유니코드 : "+intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : "+longValue);

        /*크기 비교 : long(정수,8byte) < float(실수,8byte)
        정수 < 실수 고정*/
        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue : "+floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue : "+doubleValue);
    }
}
