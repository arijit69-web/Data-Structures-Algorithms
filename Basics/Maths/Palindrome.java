/*
Link : https://practice.geeksforgeeks.org/problems/palindrome0746/1
*/
class Solution {
    public String is_palindrome(int n) {
        String str = Integer.toString(n);
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        String temp = sb.toString();
        if (str.equals(temp))
            return "Yes";
        return "No";
    }
}