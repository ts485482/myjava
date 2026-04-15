package ch06.sec07;

import java.util.Date;
import java.text.SimpleDateFormat;
public class ImportTest {
    public static void main(String[] args) {
        //import문 예제
        Date today = new Date();

        //yyyy : 연도 / MM : 월 / dd : 일
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        //a : 오전/오후 / hh : 시 / mm : 분 / ss : 초
        SimpleDateFormat time = new SimpleDateFormat("a hh:mm:ss");
    
        System.out.println("오늘 날짜는 " + date.format(today) + "입니다.");
        System.out.println("현재 시각은 " + time.format(today) + "입니다.");
    }
}
