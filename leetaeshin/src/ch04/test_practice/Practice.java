package ch04.test_practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1~100 사이의 랜덤 숫자 생성
        int targetNumber = 0;
        int attempts = 0; // 시도 횟수
        int maxAttempts = 10; // 제한 횟수
        boolean isCorrect = false;
        System.out.println("=== 1부터 100 사이의 숫자를 맞춰보세요! ===");
        System.out.println("기회는 총 " + maxAttempts + "번입니다.");
        
        while(true){
            System.out.println("=== 쉬움 - 1 | 보통 - 2 | 어려움 - 3 ===");
            System.out.print("난이도 선택(숫자로 선택해주세요!!) : ");
            int difficult = scanner.nextInt();
            System.out.println();
    
            if(difficult == 1){
                targetNumber = (int)(Math.random()*50) + 1;
                System.out.println("쉬움 난이도가 설정되었습니다! 숫자는 1~50 입니다!");
                break;
            } else if(difficult == 2){
                targetNumber = (int)(Math.random()*100) + 1;
                System.out.println("보통 난이도가 설정되었습니다! 숫자는 1~100 입니다!");
                break;
            } else if(difficult == 3){
                targetNumber = (int)(Math.random()*150) + 1;
                System.out.println("어려움 난이도가 설정되었습니다! 숫자는 1~150 입니다!");
                break;
            } else{
                System.out.println("잘못 선택하셨습니다. 다시 선택해주세요!");
            }
        }


        // 정답을 맞히거나 기회를 다 쓸 때까지 반복
        while (attempts < maxAttempts) {
            attempts++;
            System.out.println("남은 기회 : " + (maxAttempts - attempts + 1) + "번");
            System.out.print(attempts + "번째 시도: ");
            int guess = scanner.nextInt();

            // 입력값과 정답 비교 (조건문)
            if (guess == targetNumber) {
                System.out.println();
                System.out.println("축하합니다!! " + attempts + "번 만에 맞히셨습니다.");
                System.out.println();
                isCorrect = true;
                break; // 정답을 맞히면 반복문 탈출
            } else if (guess < targetNumber) {
                System.out.println("UP! 더 큰 숫자입니다.");
                System.out.println();
            } else {
                System.out.println("DOWN! 더 작은 숫자입니다.");
                System.out.println();
            }
        }

        if (!isCorrect) {
            System.out.println("실패! 정답은 " + targetNumber + "였습니다.");
            System.out.println();
        }

        // 게임 종료 후 별점을 출력하는 반복문 연습
        System.out.print("게임 매너 점수: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("★ ");
        }
        System.out.println("\n수고하셨습니다!");
        System.out.println();
        
    }
}
