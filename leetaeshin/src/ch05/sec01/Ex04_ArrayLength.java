package ch05.sec01;

public class Ex04_ArrayLength {
    public static void main(String[] args) {
        int[] scores = {83,90,87};

        int sum = 0;
        //배열변수.length - 배열에서 지원 / 메타데이터에 저장되어있는 값을 불러옴(읽기 전용)
        //메타데이터 - 시스템만 저장할 수 있는 영역
        for(int i = 0; i<scores.length; i++){
            sum += scores[i];
        }
        System.out.println("총합 : " + sum);

        float avg = (float)sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
