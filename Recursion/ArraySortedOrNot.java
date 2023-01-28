/*
Link : https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
*/

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {

        return check(0, arr, n);
    }

    public static boolean check(int i, int arr[], int n) {
        if (i == n || i == n - 1)
            return true;

        if (arr[i] > arr[i + 1])
            return false;

        boolean flag = check(i + 1, arr, n);

        return flag;
    }
}