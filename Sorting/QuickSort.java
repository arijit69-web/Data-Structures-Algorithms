/*
Link : https://practice.geeksforgeeks.org/problems/bubble-sort/1
*/

class Solution {
    int[] sortArr(int[] arr, int n) {
        sort(arr, 0, n - 1);
        return arr;

    }

    public static void sort(int[] arr, int low, int high) {
        if (low > high)
            return;
        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e) {
            while (arr[s] < pivot)
                s++;
            while (arr[e] > pivot)
                e--;
            if (s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        sort(arr, low, e);
        sort(arr, s, high);
    }
}