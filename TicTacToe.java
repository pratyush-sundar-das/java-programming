import java.util.Scanner;

public class TicTacToe {

    private static final char X = 'X';
    private static final char O = 'O';
    private static final char EMPTY = '-';

    private static char[][] board;
    private static char currentPlayer;

    public static void main(String[] args) {
        board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = EMPTY;
            }
        }

        currentPlayer = X;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printBoard();

            System.out.println("It is " + currentPlayer + "'s turn.");
            System.out.println("Enter a row and column (1-3): ");
            int row = scanner.nextInt() - 1;
            int column = scanner.nextInt() - 1;

            if (!isValidMove(row, column)) {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            board[row][column] = currentPlayer;

            if (hasWon(currentPlayer)) {
                System.out.println(currentPlayer + " wins!");
                break;
            }

            if (isDraw()) {
                System.out.println("The game is a draw.");
                break;
            }

            currentPlayer = currentPlayer == X ? O : X;
        }

        scanner.close();
    }

    private static boolean isValidMove(int row, int column) {
        return row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == EMPTY;
    }

    private static boolean hasWon(char player) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }

    private static boolean isDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }
}
