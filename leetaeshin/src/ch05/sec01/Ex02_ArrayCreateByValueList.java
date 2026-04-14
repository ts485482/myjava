package ch05.sec01;

public class Ex02_ArrayCreateByValueList {
    public static void main(String[] args) {
        /* 예제
        
        int[] scores={83,90,87};
        
        System.out.println("scores[0] : " + scores[0]);
        System.out.println("scores[1] : " + scores[1]);
        System.out.println("scores[2] : " + scores[2]);
        
        int sum=0;
        for(int i=0; i<3; i++){
            sum += scores[i];
        }
        
        System.out.println("총합 : " + sum);
        double avg = (double)sum / 3;
        System.out.println("평균 : " + avg);
        */

        //연습

        int[] scores = {83,90,87};

        int sum = 0;
        for(int i=0; i<3; i++){
            System.out.println("scores[" + i + "] : " + scores[i]);
            sum += scores[i];
        }
        System.out.println("종합 : " + sum);
        double avg = (double)sum / 3;
        System.out.println("평균 : " + avg);
    }
}
