package ch02.sec02;

public class Ex10_OperationPromotion {
    public static void main(String[] args) {
        //작은크기타입과 큰크기타입 연산 > 큰크기타입으로 바뀜
        byte result1 = 10 + 20;
        System.out.println("result1 : "+result1);

        //더한 시점에 값 자체가 int형으로 들어옴
        //byte result2 = v1 + v2;       //값손실
        byte v1 = 10;
        byte v2 = 20;
        int result2 = v1 + v2;
        System.out.println("result2 : "+result2);

        byte v3 = 10;
        int v4 = 100;
        long v5 = 1000L;
        long result3 = v3 + v4 + v5;
        System.out.println("result3 : "+result3);

        char v6 = 'A';
        char v7 = 2;
        int result4 = v6 + v7;
        System.out.println("result4 : "+result4);
        System.out.println("result4 : "+(char)result4);

        int v8 = 10;
        int result5 = v8/4;
        System.out.println("result5 : "+result5);

        int v9 = 10;
        double result6 = v9/4.0;
        System.out.println("result6 : "+result6);
    }
}
