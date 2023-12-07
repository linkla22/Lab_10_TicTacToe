import java.util.Scanner;

public class TicTacToe {
    private static final int ROW = 3;
    private static final int COL = 3;
    private static String[][] board = new String[ROW][COL];
    private static String currentPlayer = "X";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    private static int[] getPlayerMove(Scanner scanner) {
        System.out.println("Player " + currentPlayer + "'s turn.");
        int row = SafeInput.getRangedInt(scanner, "Enter the row (1-3): ", 1, 3);
        int col = SafeInput.getRangedInt(scanner, "Enter the column (1-3): ", 1, 3);
        return new int[]{row, col};
            private static boolean isTie() {
                for (int row = 0; row < ROW; row++) {
                    for (int col = 0; col < COL; col++) {
                        if (board[row][col].equals(" ")) {
                            return false;
                        }
                    }
                }
                private static boolean isDiagonalWin(String player) {
                    return (board[0][0].equals(player) && board[1][1].equals(player) && board[2][2].equals(player)) ||
                            (board[0][2].equals(player) && board[1][1].equals(player) && board[2][0].equals(player));
                }
                private static boolean isRowWin(String player) {
                    for (int row = 0; row < ROW; row++) {
                        if (board[row][0].equals(player) && board[row][1].equals(player) && board[row][2].equals(player)) {
                            return true;
                        }
                    }
                    return false;
                }
                private static boolean isColWin(String player) {
                    for (int col = 0; col < COL; col++) {
                        if (board[0][col].equals(player) && board[1][col].equals(player) && board[2][col].equals(player)) {
                            return true;
                        }
                    }
                    return false;
                }
    }
}
