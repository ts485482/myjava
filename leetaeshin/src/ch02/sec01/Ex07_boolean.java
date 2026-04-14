package ch02.sec01;

public class Ex07_boolean {
    public static void main(String[] args) {
        //stop영역(1byte) 생성 후 true값 저장
        boolean stop = true;
        if(stop) {
            System.out.println("중지합니다.");
        } else {
            System.out.println("시작합니다.");
        }
    }
}
