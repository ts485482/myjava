package ch02.sec03;

import java.util.Scanner;

public class Ex13_Scanner {
    public static void main(String[] args) {
        //Scanner 클래스 생성
        Scanner scanner = new Scanner(System.in);

        System.out.print("x값 입력 : ");
        //scanner.nextLine : 사용자가 직접 입력한 값을 받아옴
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y값 입력 : ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("x + y :" + result);
        System.out.println();

        while(true){
            System.out.print("입력 문자열 : ");
            String data = scanner.nextLine();
            if(data.equals("q")){
                break;
            }
            System.out.println("출력 문자열 : " + data);
            System.out.println();
        }

        System.out.println("종료");
    }
}
