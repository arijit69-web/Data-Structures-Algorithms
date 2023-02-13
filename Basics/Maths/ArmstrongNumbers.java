/*
Link : https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1
*/
class Solution {
    static String armstrongNumber(int n) {

        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + (int) Math.pow(rem, 3);
            temp = temp / 10;
        }
        if (sum == n)
            return "Yes";
        return "No";
    }
}