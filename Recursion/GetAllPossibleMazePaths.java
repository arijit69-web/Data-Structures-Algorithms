import java.util.*;

public class MatrixTraversal {
    private static void printMatrixPath(int mat[][], int m, int n, int i, int j, List<Integer> list) {
        if (i >= m || j >= n)
            return;
        if (i == m - 1 && j == n - 1) {
            list.add(mat[i][j]);

            System.out.println(list);
            list.remove(list.size() - 1);

        }
        list.add(mat[i][j]);

        printMatrixPath(mat, m, n, i + 1, j, list);
        printMatrixPath(mat, m, n, i, j + 1, list);
        list.remove(list.size() - 1);

    }

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int mat[][] = { { 1, 2, 3 },
                { 4, 5, 6 } };
        List<Integer> list = new ArrayList<>();
        printMatrixPath(mat, m, n, 0, 0, list);
    }
}
