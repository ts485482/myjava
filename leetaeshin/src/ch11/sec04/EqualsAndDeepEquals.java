package ch11.sec04;

import java.util.Arrays;
import java.util.Objects;
public class EqualsAndDeepEquals {
    public static void main(String[] args) {
        Integer o1 = 1000;
        Integer o2 = 1000;
        System.out.println(Objects.equals(o1, o2));
        System.out.println(Objects.equals(o1, null));
        System.out.println(Objects.equals(null, o2));
        System.out.println(Objects.equals(null,null));
        //deepEquals(a,b) - 객체의 주소가 아닌, 주소 안에 존재하는 값 자체 비교(a와 b의 값 비교)
        System.out.println(Objects.deepEquals(o1, o2) + "\n");

        Integer[] arr1 = {1,2};
        Integer[] arr2 = {1,2};
        System.out.println(Objects.equals(arr1, arr2));
        //주소 안에 존재하는 값 비교(arr1 내부의 주소와 aar2 내부의 주소 비교)
        System.out.println(Objects.deepEquals(arr1, arr2));
        //배열 내부 값 자체를 비교
        System.out.println(Arrays.deepEquals(arr1, arr2));
        System.out.println(Objects.deepEquals(null, arr2));
        System.out.println(Objects.deepEquals(arr1, null));
        System.out.println(Objects.deepEquals(null, null));
    }
}
