/*
Link : https://practice.geeksforgeeks.org/problems/bubble-sort/1
*/
class Solution {
    int[] sortArr(int[] arr, int n) {
        sort(arr, 0, n - 1);
        return arr;

    }

    public static void sort(int arr[], int low, int end) {
        if (low < end) {
            int m = low + (end - low) / 2;
            sort(arr, low, m);
            sort(arr, m + 1, end);
            merge(arr, low, m, end);

        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {

        int n1 = mid - low + 1;
        int n2 = high - mid;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++) {
            L[i] = arr[i + low];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }
        int i = 0;
        int j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i++];
            } else {
                arr[k] = R[j++];
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i++];
            k++;

        }
        while (j < n2) {
            arr[k] = R[j++];
            k++;

        }

    }
}