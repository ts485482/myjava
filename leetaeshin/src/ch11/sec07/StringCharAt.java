package ch11.sec07;

public class StringCharAt {
    public static void main(String[] args) {
        String ssn = "010502-1234567";
        //charAt(a) - 문자열에서 a번째 문자
        char sex = ssn.charAt(7);
        switch(sex){
            case '1', '3' -> System.out.println("남자입니다.");
            case '2', '4' -> System.out.println("여자입니다.");
        }
    }
}
