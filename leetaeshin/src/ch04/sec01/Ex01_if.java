package ch04.sec01;

public class Ex01_if {
    public static void main(String[] args) {
        int score = 93;

        if (score >= 90){
            System.out.println("점수가 90점 이상입니다.");
            System.out.println("등급은 A등급 입니다.");
        }

        if (score < 90) {
            System.out.println("점수가 90점 이하입니다.");
            System.out.println("등급은 B등급 입니다.");
        }
    }
}
