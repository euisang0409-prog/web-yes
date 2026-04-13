package exam;

import java.util.Scanner;

// 빙고 게임 프로세스
// 게임의 시작, 빙고 숫자 입력

public class BingoGame {

    // Bingo 객체를 필드로 선언하세요
    // 사용자에게 입력을 받기 위한 Scanner객체를 선언하세요
    private Bingo bingo;
    private Scanner sc;

    // 생성자에서 Bingo 객체를 생성하세요
    // Scanner 객체도 생성하세요
    public BingoGame() {
        this.bingo = new Bingo();
        sc = new Scanner(System.in);
    }

    // start()메서드를 작성하여 게임 전체 흐름 구현하세요
    // 게임 시작시 "빙고 게임을 시작합니다" 라고 출력하기
    // 반복문을 사용하여 숫자를 계속 입력받을 수 있도록 합니다.

    public void start() {

        System.out.println("빙고 게임을 시작합니다.");

        while (true) {

            // 1단계
            // 현재 빙고판을 출력합니다.
        	 bingo.printBoard();
        	// 1-1 단계
        	// 현재 빙고 개수를 계산하여 출력하세요
        	// 현재 빙고 개수 : x
        	int bingoCount = bingo.countBingo();
        	System.out.println("현재 빙고 개수 : " + bingoCount);
        	// 1-2 단계
        	// 빙공 개수가 3개 이상이면 게임을 종료하시오
        	// "3빙고 완성! 게임 종료"
           if(bingoCount >= 3) {
        	   System.out.println("3빙고 완성! 게임종료");
        	   break;
           }

            // 2단계
            // 사용자에게 숫자를 입력받습니다.
            System.out.print("숫자를 입력하세요 (종료: 0): ");
            int number = sc.nextInt();

            // 종료 조건
            if (number == 0) {
                System.out.println("게임 종료");
                break;
            }

            // 3단계
            // 입력한 숫자가 빙고판에 존재하면 체크처리
            boolean result = bingo.markNumber(number);

            // 4단계
            // 숫자가 존재한다면 "X를 체크했습니다." 라고 출력하기
            if (result) {
                System.out.println("X를 체크했습니다.");
            }
            // 5단계
            // 숫자가 빙고판에 없으면 " 빙고판에 없는 숫잡입니다. " 라고 출력하기
            else {
                System.out.println("빙고판에 없는 숫자입니다.");
            }
        }
    }
}