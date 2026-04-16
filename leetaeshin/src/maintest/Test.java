public class Test {
    public static void main(String[] args) {
        //기초 데이터 처리
        double[] arrScore = {93,80,64,72,100,95,81,87,98,70};

        double sum = 0;

        for(int i = 0; i < arrScore.length; i++){
            System.out.println((i + 1) + "번째 학생의 점수 : " + arrScore[i]);
            sum += arrScore[i];
        }

        System.out.println("==============================================================================");

        //데이터 분석
        double avg = sum / 10;

        System.out.println("총 점수 합계 : " + sum);
        System.out.println("전체 점수 평균 : " + avg);

        System.out.println("==============================================================================");
        
        //최댓값 탐색 알고리즘
        double max = arrScore[0];
        for(int i = 1; i < arrScore.length; i++){
            if(max < arrScore[i]){
                max = arrScore[i];
                System.out.println((i+1) + "회차 최댓값 변경 : " + max);
            } 
        }
        
        System.out.println("==============================================================================");

        //정렬 알고리즘 적용
        for(int i=0; i<(arrScore.length - 1); i++){
            for (int k = (i+1); k<arrScore.length; k++){
                if(arrScore[i] > arrScore[k]){
                    double a = arrScore[k];
                    arrScore[k] = arrScore[i];
                    arrScore[i] = a;
                }
            }
        }
        System.out.println("가장 낮은 점수가 배열 앞쪽으로 오도록 정렬되었는지 확인.");
        for(int i=0; i<arrScore.length; i++){
            System.out.println("arrScore[" + i + "] : " + arrScore[i]);
        }
        System.out.println("==============================================================================");
        System.out.print("순서대로 정렬 : {");
        for(int i=0; i<arrScore.length; i++){
            System.out.print(arrScore[i] + ",");
        }
        System.out.print("}");
    }
}
