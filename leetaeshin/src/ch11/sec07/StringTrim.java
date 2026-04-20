package ch11.sec07;

public class StringTrim {
    public static void main(String[] args) {
        String tel1 = " 02";
        String tel2 = "123   ";
        String tel3 = "  1234   ";

        //trim() : 문자열에 존재하는 공백 전체 제거
        String tel = tel1.trim() + tel2.trim() + tel3.trim();
        System.out.println(tel);
    }
}
