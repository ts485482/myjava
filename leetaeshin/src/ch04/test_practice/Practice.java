package ch04.test_practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Math.random() : 1~100 사이의 랜덤 숫자 생성
        int targetNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0; // 시도 횟수
        int maxAttempts = 10; // 제한 횟수
        boolean isCorrect = false;

        System.out.println("=== 1부터 100 사이의 숫자를 맞춰보세요! ===");
        System.out.println("기회는 총 " + maxAttempts + "번입니다.");

        // 2. while : 정답을 맞히거나 기회를 다 쓸 때까지 반복
        while (attempts < maxAttempts) {
            attempts++;
            System.out.print(attempts + "번째 시도: ");
            int guess = scanner.nextInt();

            // 3. if-else : 입력값과 정답 비교 (조건문)
            if (guess == targetNumber) {
                System.out.println("축하합니다! " + attempts + "번 만에 맞히셨습니다.");
                isCorrect = true;
                break; // 정답을 맞히면 반복문 탈출
            } else if (guess < targetNumber) {
                System.out.println("UP! 더 큰 숫자입니다.");
            } else {
                System.out.println("DOWN! 더 작은 숫자입니다.");
            }
        }

        if (!isCorrect) {
            System.out.println("실패! 정답은 " + targetNumber + "였습니다.");
        }

        // 4. for : 게임 종료 후 별점을 출력하는 반복문 연습
        System.out.print("게임 매너 점수: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("★");
        }
        System.out.println("\n수고하셨습니다!");
        
        scanner.close();
    }

    /* while 문 대신 전체 게임을 for 문으로 바꿔서 구현해보기.

    난이도 선택 기능을 넣어서 1번 선택 시 1~50, 2번 선택 시 1~100 범위로 조절하기.
    
    while 문 안에 if 문을 써서 특정 숫자를 입력하면 '힌트'를 주는 기능 만들기. */
}
