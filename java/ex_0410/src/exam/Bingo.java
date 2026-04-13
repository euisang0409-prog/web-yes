package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 빙고판의 생성, 출력, 빙고 개수 세기
public class Bingo {

    int[][] board = new int[5][5]; // 빙고판 저장

    public Bingo() {
        createBoard();
    }

    private void createBoard() {

        // 1 ~ 50사이의 난수가 있다.
        // 5 X 5의 빙고판에 25개의 숫자를 채운다.
        // 겹치면 안됨!

        // 만약 숫자가 오름차순으로 연속되게 나오면 섞어주기

        Set<Integer> set = new HashSet<>();

        while (set.size() < 25) {
            int rand = (int) (Math.random() * 50) + 1;
            set.add(rand);
        }

        List<Integer> list = new ArrayList<>(set);
        Collections.shuffle(list); // 섞기

        int index = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = list.get(index++);
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 숫자를 체크하는 메서드
    // 숫자를 넘겨받으면 해당 빙고판의 숫자를 0으로 바꾸고 true 반환
    // 없으면 false 반환
    public boolean markNumber(int number) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == number) {
                    board[i][j] = 0;
                    return true;
                }
            }
        }

        return false;
    }

    // 현재 빙고판 출력
    // 체크된 칸은 X로 출력
    public void printBoard() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {

                if (board[i][j] == 0) {
                    System.out.print("X\t");
                } else {
                    System.out.print(board[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    // 빙고 개수 계산
    // 가로 5줄, 세로 5줄, 대각선 2줄 검사
    public int countBingo() {

        int bingoCount = 0;

        // 가로
        for (int i = 0; i < 5; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == 0) count++;
            }
            if (count == 5) bingoCount++;
        }

        // 세로
        for (int j = 0; j < 5; j++) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (board[i][j] == 0) count++;
            }
            if (count == 5) bingoCount++;
        }

        // 대각선 ↘
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (board[i][i] == 0) count++;
        }
        if (count == 5) bingoCount++;

        // 대각선 ↙
        count = 0;  
        for (int i = 0; i < 5; i++) {
            if (board[i][4 - i] == 0) count++;
        }
        if (count == 5) bingoCount++;

        return bingoCount;
    }
}