package ch04.test_practice;

public class Test03 {
    public static void main(String[] args) {
        //초등학교 3~6학년 1~5반 출력 (학년 - 오름차순 / 반 - 내림차순)
        int i;
        for(i = 3; i <=6; i++){
            System.out.println("=======" + i + "학년=======");
            for(int j = 5; j >= 1; j--){
                System.out.println(i+ "학년 " + j + "반");
            }
        }

    }
}
