/* Link : https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/0?category%5B%5D=Java&category%5B%5D=Java&difficulty%5B%5D=-2&page=1&query=category%5B%5DJavadifficulty%5B%5D-2page1category%5B%5DJava */

class Solution {
    static String compareNM(int n, int m) {
        String ans = "";
        if (n < m)
            ans = "lesser";
        else if (n == m)
            ans = "equal";
        else
            ans = "greater";

        return ans;

    }
}