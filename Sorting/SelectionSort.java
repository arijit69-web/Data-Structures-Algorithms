/*
Link : https://practice.geeksforgeeks.org/problems/bubble-sort/1
*/

class Solution {
    public static void bubbleSort(int a[], int n) {
        for (int i = 0; i < n; i++) {
            int imin = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[imin]) {
                    imin = j;
                }
            }
            swap(a, imin, i);
        }
    }

    public static void swap(int a[], int j, int k) {
        int temp = a[j];
        a[j] = a[k];
        a[k] = temp;

    }
}