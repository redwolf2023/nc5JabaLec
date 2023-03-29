package homework0317;

import java.util.Random;
import java.util.Scanner;

public class BaseballGame {
    public static void main(String[] args) {
        // 1~9 사이의 서로 다른 숫자 3개를 랜덤하게 생성
        Random random = new Random();
        int[] answer = new int[3];
        for (int i = 0; i < 3; i++) {
            int num = random.nextInt(9) + 1;
            for (int j = 0; j < i; j++) {
                if (answer[j] == num) {
                    num = random.nextInt(9) + 1;
                    j = -1;
                }
            }
            answer[i] = num;
        }

        // 사용자 입력 받기
        Scanner scanner = new Scanner(System.in);
        int[] guess = new int[3];
        int tryCount = 0;
        while (true) {
            System.out.print("1~9 사이의 숫자 3개를 입력하세요(ex. 1 2 3): ");
            for (int i = 0; i < 3; i++) {
                guess[i] = scanner.nextInt();
            }

            // 숫자와 자리가 일치하는 갯수 세기
            int strikeCount = 0;
            for (int i = 0; i < 3; i++) {
                if (guess[i] == answer[i]) {
                    strikeCount++;
                }
            }

            // 숫자는 맞지만 자리가 다른 갯수 세기
            int ballCount = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (i == j) {
                        continue;
                    }
                    if (guess[i] == answer[j]) {
                        ballCount++;
                    }
                }
            }

            // 결과 출력
            tryCount++;
            System.out.printf("%d번째 시도 결과: %d 스트라이크, %d 볼%n", tryCount, strikeCount, ballCount);
            if (strikeCount == 3) {
                System.out.println("축하합니다! 세 개의 숫자를 모두 맞췄습니다!");
                break;
            }
        }
    }
}
