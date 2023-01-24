/*

Link : https://leetcode.com/problems/n-queens/description/

*/
class Solution {
    public List<List<String>> solveNQueens(int n) {
        String arr[][] = new String[n][n];
        List<List<String>> ll = new ArrayList<List<String>>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = ".";
            }
        }

        nQueen(arr, 0, n, ll);
        return ll;
    }

    public static boolean nQueen(String arr[][], int row, int n, List<List<String>> ll) {
        if (row >= n) {
            ArrayList<String> al = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String s = "";
                for (int j = 0; j < n; j++) {
                    s = s + arr[i][j];
                }
                al.add(s);
            }
            ll.add(al);

            return false;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(arr, row, col, n)) {
                arr[row][col] = "Q";
                if (nQueen(arr, row + 1, n, ll))
                    return true;

                arr[row][col] = ".";
            }
        }
        return false;

    }

    public static boolean isSafe(String a[][], int row, int col, int n) {
        for (int r = 0; r < row; r++) {
            if (a[r][col].equals("Q"))
                return false;
        }

        int r = row;
        int c = col;
        while (c >= 0 && r >= 0) {
            if (a[r][c].equals("Q"))
                return false;
            c--;
            r--;

        }
        r = row;
        c = col;
        while (c < n && r >= 0) {
            if (a[r][c].equals("Q"))
                return false;
            c++;
            r--;

        }
        return true;
    }
}