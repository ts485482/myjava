package ch05.sec01;

public class Ex09_ArrayCopyBySystem {
    public static void main(String[] args) {
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        //System.arraycopy(시작지점, 도착지점, 수(시작지점 최대수))
        System.arraycopy(oldStrArray,0,newStrArray,0,oldStrArray.length);

        //값 : java, array, copy, null, null, 나옴
        //newStrArray에서 2인덱스까지만 복사되어, 3,4인덱스는 지정x
        for(int i=0; i<newStrArray.length; i++){
            System.out.print(newStrArray[i] + ",");
        }
    }
}
