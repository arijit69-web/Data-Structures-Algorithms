/*
Link : https://practice.geeksforgeeks.org/problems/bubble-sort/1
*/

class Solution {
    public static void insertionSort(int a[], int n) {
        for (int i = 1; i < n; i++) {
            int hole = i;
            int value = a[i];
            while (hole > 0 && value < a[hole - 1]) {
                a[hole] = a[hole - 1];
                hole--;
            }
            a[hole] = value;
        }
    }

}