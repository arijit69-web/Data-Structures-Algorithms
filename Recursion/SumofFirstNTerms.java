/*
Link : https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=sum-of-first-n-terms
*/
class Solution {
    long sumOfSeries(long N) {
        long ans[] = { 0 };
        sum(ans, N);
        return ans[0];
    }

    public static void sum(long ans[], long N) {
        if (N == 0)
            return;
        ans[0] = ans[0] + (long) Math.pow(N, 3);
        sum(ans, N - 1);
    }
}