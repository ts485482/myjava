package ch05.sec01;

public class Ex04_ArrayCreateByNew{
    public static void main(String[] args) {
        //기본형 - 기본값 : 0
        //값 생성 시 - 값 저장
        int[] arr1 = new int[3];
        for(int i = 0; i<3; i++){
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for(int i = 0; i<3; i++){
            System.out.println("arr1[" + i + "] : " + arr1[i]);
        }

        double[] arr2 = new double[3];

        for(int i=0; i<3; i++){
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;        
        for(int i = 0; i<3; i++){
            System.out.println("arr2[" + i + "] : " + arr2[i]);
        }
        
        //참조형 - 기본값:null
        //값 생성 시 - 주소 보관
        String[] arr3 = new String[3];
        
        for(int i = 0; i<3; i++){
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
        //리터럴객체 사용.(arr3[0]과 arr3[1] 둘다 "1월" 대입 시, 두 개의 주소 같음.)
        arr3[0] = "1월";
        arr3[1] = "2월";
        arr3[2] = "3월";
        for(int i = 0; i<3; i++){
            //결과값이 주소가 아닌 값이 나오는 이유 : arr3[i] 뒤에 .toString()이 숨겨져있음
            System.out.println("arr3[" + i + "] : " + arr3[i]);
        }
    }
}