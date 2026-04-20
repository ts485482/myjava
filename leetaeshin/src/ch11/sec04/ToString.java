package ch11.sec04;

import java.util.Objects;

public class ToString {
    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = null;
    
        System.out.println(Objects.toString(str1));
        //Objects.toString(null) -> null 그대로 출력(Objects에서만 됨)
        System.out.println(Objects.toString(str2));
        //Objects.toString(null, "") -> null일 시, 두번째 매개값의 문자열 출력
        System.out.println(Objects.toString(str2, "이름이 없습니다."));
    }
}
