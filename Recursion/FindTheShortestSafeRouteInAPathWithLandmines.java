class Pair {
    Integer x;
    Integer y;

    Pair(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object o) {
        Pair p = (Pair) o;
        return x == p.x && y == p.y;
    }

    public int hashCode() {
        return x + y;
    }
}

class Solution {
    public static int findShortestPath(int[][] mat) {
        int row = mat.length;
        if (row == 0)
            return -1;
        int col = mat[0].length;

        boolean visited[][] = new boolean[row][col];
        ArrayList<Pair> al = new ArrayList<>();
        storeUnsafePlace(mat, row, col, al);

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < row; i++) {
            if (mat[i][0] != 0) {
                int length = solve(row, col, al, visited, i, 0, 0);
                ans = Math.min(ans, length);
            }
        }
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;

    }

    public static int solve(int row, int col, ArrayList<Pair> al, boolean visited[][], int i, int j, int steps) {
        if (i == row || i < 0 || j < 0 || j == col || al.contains(new Pair(i, j)) || visited[i][j])
            return Integer.MAX_VALUE;

        if (j == col - 1)
            return steps + 1;

        visited[i][j] = true;
        int down = solve(row, col, al, visited, i + 1, j, steps + 1);
        int up = solve(row, col, al, visited, i - 1, j, steps + 1);
        int right = solve(row, col, al, visited, i, j + 1, steps + 1);
        int left = solve(row, col, al, visited, i, j - 1, steps + 1);
        visited[i][j] = false;
        return Math.min(up, Math.min(down, Math.min(right, left)));

    }

    public static void storeUnsafePlace(int mat[][], int row, int col, ArrayList<Pair> al) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    al.add(new Pair(i, j));

                    if (i + 1 < row) {
                        al.add(new Pair(i + 1, j));
                    }
                    if (i - 1 >= 0) {
                        al.add(new Pair(i - 1, j));
                    }
                    if (j - 1 >= 0) {
                        al.add(new Pair(i, j - 1));
                    }
                    if (j + 1 < col) {
                        al.add(new Pair(i, j + 1));
                    }
                }
            }
        }
    }
}
