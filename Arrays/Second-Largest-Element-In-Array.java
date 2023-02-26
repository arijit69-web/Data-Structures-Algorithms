/*
Link : https://practice.geeksforgeeks.org/problems/second-largest3735/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=second-largest
*/
class Solution {
    int print2largest(int arr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max)
                max2 = Math.max(max2, arr[i]);
        }
        if (max2 == Integer.MIN_VALUE)
            return -1;
        return max2;

    }
}