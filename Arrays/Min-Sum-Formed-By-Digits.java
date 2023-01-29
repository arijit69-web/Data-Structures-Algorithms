/*
Link : https://practice.geeksforgeeks.org/problems/min-sum-formed-by-digits3551/1 
*/
class Solution {

    public static long minSum(int arr[], int n) {
        if (n == 1) {

            return arr[n - 1];

        }

        Arrays.sort(arr);

        String a = "";

        String b = "";

        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {

                a = a + Integer.toString(arr[i]);

            }

            else if (i % 2 == 1) {

                b = b + Integer.toString(arr[i]);

            }

        }

        if (a.equals("")) {

            a = "0";

        }

        if (b.equals("")) {

            b = "0";

        }

        long val = Long.parseLong(a) + Long.parseLong(b);

        return val;
    }
}