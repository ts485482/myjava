package ch05.sec01;

public class Ex07_ArrayReferenceObject {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "java";
        strArray[1] = "java";
        strArray[2] = new String("java");

        System.out.println(strArray[0] == strArray[1]);     //0인덱스와 1인덱스의 주소가 같음
        System.out.println(strArray[0] == strArray[2]);     //0인덱스와 2인덱스의 주소가 다름
        System.out.println(strArray[0].equals(strArray[2]));    //0인덱스의 값과 2인덱스의 값이 같음
    }
}
