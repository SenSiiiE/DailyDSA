package com.snake;
public class SudokuSolver {

    public static boolean solveSudoku(int[][] board) {
        int N = board.length;
        int[] emptyCell = findEmptyCell(board);

        if (emptyCell == null) {
            return true;  // All cells are filled
        }

        int row = emptyCell[0];
        int col = emptyCell[1];

        for (int num = 1; num <= N; num++) {
            if (isValidMove(board, row, col, num)) {
                board[row][col] = num;

                if (solveSudoku(board)) {
                    return true;  // Successfully solved
                }

                // Backtrack
                board[row][col] = 0;
            }
        }

        return false;  // No valid number found, need to backtrack
    }

    public static int[] findEmptyCell(int[][] board) {
        int N = board.length;

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                if (board[row][col] == 0) {
                    return new int[]{row, col};
                }
            }
        }

        return null;  // All cells are filled
    }

    public static boolean isValidMove(int[][] board, int row, int col, int num) {
        int N = board.length;

        // Check if 'num' is not in the same row or column
        for (int i = 0; i < N; i++) {
            if (board[row][i] == num || board[i][col] == num) {
                return false;
            }
        }

        // Check if 'num' is not in the same 3x3 subgrid
        int subgridSize = (int) Math.sqrt(N);
        int startRow = row - row % subgridSize;
        int startCol = col - col % subgridSize;

        for (int i = startRow; i < startRow + subgridSize; i++) {
            for (int j = startCol; j < startCol + subgridSize; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;  // 'num' is a valid move
    }

    public static void printBoard(int[][] board) {
        int N = board.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        if (solveSudoku(board)) {
            System.out.println("Sudoku solved:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }
}

