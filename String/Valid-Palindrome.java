/*
Link : https://leetcode.com/problems/valid-palindrome/description/
*/
class Solution {
    public boolean isPalindrome(String s) {
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                ans = ans + c;

            }
        }

        ans = ans.toLowerCase();
        StringBuilder sb = new StringBuilder(ans);
        sb.reverse();
        String tempAns = sb.toString();
        if (tempAns.equals(ans))
            return true;
        return false;

    }
}