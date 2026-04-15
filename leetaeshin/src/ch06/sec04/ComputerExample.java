package ch06.sec04;

public class ComputerExample {
    public static void main(String[] args) {
        Computer myCom = new Computer();

        int[] values1 = {1,2,3};
        int result1 = myCom.sum1(values1);
        System.out.println("result1 : " + result1);

        /*
        예제식(익명배열 사용 지양)
        int result2 = myCon.sum1(new int[] {1,2,3,4,5});
        System.out.println("result2 : " + result2);
        */

         //더 좋은 방식
         int[] values2 = new int[] {1,2,3,4,5};
         int result2 = myCom.sum1(values2);
         System.out.println("result2 : " + result2);


        //가변적 처리(거의 사용 X)
        int result3 = myCom.sum2(1,2,3);
        System.out.println("result3 : " + result3);

        int result4 = myCom.sum2(1,2,3,4,5);
        System.out.println("result4 : " + result4);
    }
}
