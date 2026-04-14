package ch05.sec01;

public class Ex08_ArrayCopyByFor {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];

        //기존 배열에서 새 배열에 저장
        for(int i = 0; i<oldIntArray.length; i++){
            newIntArray[i] = oldIntArray[i];
        }

        for(int i = 0; i < newIntArray.length; i++){
            System.out.print(newIntArray[i] + ",");
        }
    }
}
