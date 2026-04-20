package ch11.sec08;

public class StringSplit {
    public static void main(String[] args) {
        String text = "홍길동&이수홍,박연수,김자바-최명호";
        //split(a) : 문자열 중 a를 기준으로 문자열을 나눔
        String[] names = text.split("&|,|-");

        for(String name : names){
            System.out.println(name);
        }
    }
}
