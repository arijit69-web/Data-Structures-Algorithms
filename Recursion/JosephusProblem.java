/*
Link : https://practice.geeksforgeeks.org/problems/josephus-problem/1
*/

class Solution {
    public int josephus(int n, int k) {
        return solve(n, k - 1);
    }

    public static int solve(int n, int k) {
        if (n == 1)
            return 1;

        int smallCountofPeople = solve(n - 1, k);
        int passKnife = (smallCountofPeople + k) % n + 1;

        return passKnife;

    }

}
