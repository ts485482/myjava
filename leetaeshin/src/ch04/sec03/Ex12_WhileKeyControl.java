package ch04.sec03;

import java.util.Scanner;
public class Ex12_WhileKeyControl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while(run){
            System.out.println("-------------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------------");
            System.out.print("선택 : ");

            String strNum = scanner.nextLine();

            if(strNum.equals("1") || strNum.equals("증속")){
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if(strNum.equals("2") || strNum.equals("감속")){
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if(strNum.equals("3") || strNum.equals("중지")){
                //break;
                run = false;
            }
        }
        System.out.println();
        System.out.println("======프로그램이 종료됩니다.======");
        System.out.println();
    }
}
