/*
Link : https://practice.geeksforgeeks.org/problems/row-with-max-1s0023/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=row-with-max-1s
*/
class Solution {
    int rowWithMax1s(int a[][], int n, int m) {

        int i = 0;
        int max = 0;
        int row = -1;
        while (i < n) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (a[i][j] == 1)
                    count++;
            }
            if (count > max) {
                max = count;
                row = i;
            }

            i++;
        }
        return row;
    }
}