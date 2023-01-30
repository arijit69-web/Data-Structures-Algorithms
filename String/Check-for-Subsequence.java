/*
Link : https://practice.geeksforgeeks.org/problems/check-for-subsequence4930/1
*/
class Solution {
    boolean isSubSequence(String A, String B) {
        int i = 0;
        int j = 0;
        while (i < A.length() && j < B.length()) {
            if (A.charAt(i) == B.charAt(j))
                i++;
            if (i == A.length())
                return true;
            j++;
        }
        return false;

    }
}