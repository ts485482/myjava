package ch11.sec07;

public class StringSubstring {
    public static void main(String[] args) {
        String ssn = "880815-1234567";

        //substring(a,b) : a인덱스부터 b인덱스 전까지 잘라서 추출
        String firstNum = ssn.substring(0, 6);
        System.out.println(firstNum);

        //substring(a) : a인덱스부터 끝까지 잘라서 추출
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
