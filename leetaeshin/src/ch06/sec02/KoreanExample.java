package ch06.sec02;

public class KoreanExample {
    public static void main(String[] args) {
        //Korean.java에 담겨있는 Korean클래스 생성 및 활용
        Korean k1 = new Korean("박자바", "011225-1234567");
        System.out.println("k1.name = " + k1.name);
        System.out.println("k1.ssn = " + k1.ssn);
        
        Korean k2 = new Korean("김자바", "930525-0654321");
        System.out.println("k2.name = " + k2.name);
        System.out.println("k2.ssn = " + k2.ssn);
        //k2 참조변수 주소가 나옴.
        System.out.println(k2);
    }
}
