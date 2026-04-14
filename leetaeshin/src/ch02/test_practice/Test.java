package ch02.test_practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //Scanner 클래스 생성
        Scanner scanner = new Scanner(System.in);

        System.out.println("사칙연산 프로그램");
        System.out.println();


        while(true){
            System.out.println("아래 보기 중 연산을 선택해주세요. 나가고 싶으시면, \"quit\"을 작성해주세요.");
            System.out.print("1.+ 2.- 3.* 4./ 5. quit : ");
            String num = scanner.nextLine();

            if (num.equals("quit")){
                System.out.println();
                System.out.println("프로그램이 종료됩니다.");
                System.out.println();
                break;
            }

            System.out.println();
            System.out.print("x값 입력 : ");
            //scanner.nextLine : 사용자가 직접 입력한 값을 받아옴
            String strX = scanner.nextLine();
            int x = Integer.parseInt(strX);

            System.out.print("y값 입력 : ");
            String strY = scanner.nextLine();
            int y = Integer.parseInt(strY);

            if (num.equals("+")){
                int result1 = x + y;
                System.out.println();
                System.out.println("x + y :" + result1);
                System.out.println();
            } else if(num.equals("-")){
                int result2 = x - y;
                System.out.println();
                System.out.println("x - y : " + result2);
                System.out.println();
            } else if (num.equals("*")){
                int result3 = x * y;
                System.out.println();
                System.out.println("x * y : " + result3);
                System.out.println();
            } else if (num.equals("/")){
                double result4 = (double) x / y;
                System.out.println();
                System.out.println("x / y : " + result4);
                System.out.println();
            } else {
                System.out.println();
                System.out.println("연산 선택이 잘못되었습니다. 다시 시도해 주세요.");
                System.out.println();
            }
        }
        
        
    }
}
