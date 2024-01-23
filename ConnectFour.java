import java.util.Scanner;

public class ConnectFour {
    private static char[][] board = new char[6][7];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        while (true) {
            int column = promptUser();
            dropPiece(column);
            printBoard();

            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }

            if (checkDraw()) {
                System.out.println("It's a draw!");
                break;
            }

            switchPlayer();
        }
    }

    public static void initializeBoard() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static void printBoard() {
        System.out.println(" 1 2 3 4 5 6 7");
        System.out.println("+-+-+-+-+-+-+");
        for (int i = 0; i < 6; i++) {
            System.out.print("|");
            for (int j = 0; j < 7; j++) {
                System.out.print(board[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("+-+-+-+-+-+-+");
    }

    public static int promptUser() {
        Scanner scanner = new Scanner(System.in);
        int column;
        while (true) {
            System.out.print("Player " + currentPlayer + ", enter column (1-7): ");
            column = scanner.nextInt();
            if (column >= 1 && column <= 7 && board[0][column - 1] == ' ') {
                break;
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
        return column - 1;
    }

    public static void dropPiece(int column) {
        for (int i = 5; i >= 0; i--) {
            if (board[i][column] == ' ') {
                board[i][column] = currentPlayer;
                break;
            }
        }
    }

    public static void switchPlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
    }

    public static boolean checkWin() {
        return checkHorizontal() || checkVertical() || checkDiagonal();
    }

    public static boolean checkHorizontal() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == currentPlayer && board[i][j + 1] == currentPlayer &&
                        board[i][j + 2] == currentPlayer && board[i][j + 3] == currentPlayer) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkVertical() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                if (board[i][j] == currentPlayer && board[i + 1][j] == currentPlayer &&
                        board[i + 2][j] == currentPlayer && board[i + 3][j] == currentPlayer) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkDiagonal() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (board[i][j] == currentPlayer && board[i + 1][j + 1] == currentPlayer &&
                        board[i + 2][j + 2] == currentPlayer && board[i + 3][j + 3] == currentPlayer) {
                    return true;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 7; j++) {
                if (board[i][j] == currentPlayer && board[i + 1][j - 1] == currentPlayer &&
                        board[i + 2][j - 2] == currentPlayer && board[i + 3][j - 3] == currentPlayer) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean checkDraw() {
        for (int i = 0; i < 7; i++) {
            if (board[0][i] == ' ') {
                return false;
            }
        }
        return true;
    }
}
