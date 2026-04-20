package ch11.sec07;

public class StringValueOf {
    public static void main(String[] args) {
        //String.valueOf(a) : a를 문자열로 변환시켜서 저장
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(10.5);
        String str3 = String.valueOf(true);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
