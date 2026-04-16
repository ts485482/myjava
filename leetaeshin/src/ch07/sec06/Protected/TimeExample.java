package ch07.sec06.Protected;

public class TimeExample {
    public static void main(String[] args) {
        Time t = new Time(12, 38, 51);
        System.out.println(t);
        //t.hour = 13;      //컴파일 에러(Time클래스 내부에서 hour는 private처리)
        t.setHour(t.getHour()+1);       //현재 시간보다 1시간 이후로 변경한다.
        System.out.println(t);          //System.out.println(t.toString()); 과 같음.
    }


}
