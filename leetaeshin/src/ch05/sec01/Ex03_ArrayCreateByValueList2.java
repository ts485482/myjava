package ch05.sec01;

public class Ex03_ArrayCreateByValueList2 {
    public static void main(String[] args) {
        //new int[] {i,j,k}
        //매개변수값으로 생성시킴(add에서만 사용)
        //리터럴배열X - 차이점 : 사용권한 차이 
        int sum = add(new int[] {83,90,87});
        System.out.println("총합 : " + sum);
        System.out.println();
    }

    public static int add (int[] scores){
        int sum = 0;
        for(int i=0; i<3; i++){
            sum += scores[i];
        }
        return sum;
    }
}
