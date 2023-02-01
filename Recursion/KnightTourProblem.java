public class KnightTourProblem {

    public static void main(String args[]) {
        int n = 8;
        int chess[][] = new int[n][n];
        boolean flag[] = { false };
        knightTour(chess, 0, 0, 1, n, flag);
        if (!flag[0])
            System.out.print("Ooops!! Knight Tour is Closed!");

    }

    private static void knightTour(int[][] chess, int i, int j, int move, int n, boolean[] flag) {
        if (i < 0 || i >= n || j < 0 || j >= n || chess[i][j] > 0 || flag[0])// check if the indices i & j are inside
                                                                             // the chess board or not and also check if
                                                                             // the cell is visited or not and also
                                                                             // check if Knight Tour is completed or not
            return;

        else if (move == n * n) {
            flag[0] = true;
            chess[i][j] = move;// fill the last block with the current move of the Knight
            printChessBoard(chess, n);
            chess[i][j] = 0;// Backtrack and mark the cell value as 0
            return;
        }
        chess[i][j] = move;// Fill the current cell with the current move number of the Knight
        // Knight traversing the right side of the chess board in clockwise direction
        knightTour(chess, i - 2, j + 1, move + 1, n, flag);
        knightTour(chess, i - 1, j + 2, move + 1, n, flag);
        knightTour(chess, i + 1, j + 2, move + 1, n, flag);
        knightTour(chess, i + 2, j + 1, move + 1, n, flag);
        // Knight traversing the left side of the chess board in clockwise direction
        knightTour(chess, i + 2, j - 1, move + 1, n, flag);
        knightTour(chess, i + 1, j - 2, move + 1, n, flag);
        knightTour(chess, i - 1, j - 2, move + 1, n, flag);
        knightTour(chess, i - 2, j - 1, move + 1, n, flag);
        chess[i][j] = 0; // Backtracking - ager feasible solution nahi ata hai to move ko hatana zaroori
                         // hai and set that cell value as 0 as wo valid output nahi dega

    }

    private static void printChessBoard(int[][] chess, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
    }

}
