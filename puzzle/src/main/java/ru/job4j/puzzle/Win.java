package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean rsl = false;
        if (vertical(board) || horizontal(board)) {
                rsl = true;
        }

        return rsl;
    }

    public static boolean horizontal(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            int sum = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    sum += 1;
                }
            }
            if(sum == 5) {
                result = true;
                break;
            }
        }

        return result;
    }

    public static boolean vertical(int[][] board) {
        boolean result = false;
        int sum = 0;
        int point = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = point; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    sum += 1;
                    point = j;
                    break;
            }
            }
            if(sum == 5) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
        };
        System.out.println(check(board));
    }
}