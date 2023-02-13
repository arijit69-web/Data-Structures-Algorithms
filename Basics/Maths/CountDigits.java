/*
Link : https://practice.geeksforgeeks.org/problems/count-digits5716/1
*/
class Solution {
    static int evenlyDivides(int N) {
        int temp = N;
        int count = 0;
        while (N != 0) {
            int digit = N % 10;
            if (digit != 0 && temp % digit == 0)
                count++;
            N = N / 10;

        }
        return count;
    }
}