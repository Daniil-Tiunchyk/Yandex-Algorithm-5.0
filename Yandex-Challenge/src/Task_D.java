import java.util.Scanner;

public class Task_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[8][8];

        for (int i = 0; i < 8; i++) {
            String line = scanner.nextLine().trim();
            board[i] = line.toCharArray();
        }

        int emptyNonAttackedCells = countEmptyNonAttackedCells(board);
        System.out.println(emptyNonAttackedCells);
    }

    private static int countEmptyNonAttackedCells(char[][] board) {
        int count = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == '*') {
                    if (!isRookAttacking(board, i, j) && !isBishopAttacking(board, i, j)) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    private static boolean isRookAttacking(char[][] board, int row, int col) {
        for (int i = col - 1; i >= 0; i--) {
            if (board[row][i] == 'R') {
                return true;
            } else if (board[row][i] != '*') {
                break;
            }
        }
        for (int i = col + 1; i < 8; i++) {
            if (board[row][i] == 'R') {
                return true;
            } else if (board[row][i] != '*') {
                break;
            }
        }

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'R') {
                return true;
            } else if (board[i][col] != '*') {
                break;
            }
        }
        for (int i = row + 1; i < 8; i++) {
            if (board[i][col] == 'R') {
                return true;
            } else if (board[i][col] != '*') {
                break;
            }
        }

        return false;
    }

    private static boolean isBishopAttacking(char[][] board, int row, int col) {
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'B') {
                return true;
            } else if (board[i][j] != '*') {
                break;
            }
        }
        for (int i = row + 1, j = col + 1; i < 8 && j < 8; i++, j++) {
            if (board[i][j] == 'B') {
                return true;
            } else if (board[i][j] != '*') {
                break;
            }
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < 8; i--, j++) {
            if (board[i][j] == 'B') {
                return true;
            } else if (board[i][j] != '*') {
                break;
            }
        }
        for (int i = row + 1, j = col - 1; i < 8 && j >= 0; i++, j--) {
            if (board[i][j] == 'B') {
                return true;
            } else if (board[i][j] != '*') {
                break;
            }
        }

        return false;
    }
}
