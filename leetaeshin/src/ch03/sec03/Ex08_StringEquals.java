package ch03.sec03;

public class Ex08_StringEquals {
    public static void main(String[] args) {
        //리터럴객체가 저장되어있는 주소를 스택 영역에 저장
        String str1 = "신민철";
        String str2 = "신민철";
        //객체를 생성 후, 주소를 스택 영역에 저장(리터럴 객체와 주소 다름)
        String str3 = new String("신민철");

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println();
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}
