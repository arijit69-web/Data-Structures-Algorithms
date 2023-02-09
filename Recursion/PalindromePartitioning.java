/*
Link : https://leetcode.com/problems/palindrome-partitioning/description/
*/
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0, s, path, res);
        return res;
    }

    void func(int index, String s, List<String> path, List<List<String>> res) {
        if (index == s.length()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); ++i) {
            if (isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                func(i + 1, s, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    boolean isPalindrome(String s, int start, int end) {
        StringBuilder sb1 = new StringBuilder(s.substring(start, end + 1));
        StringBuilder sb2 = new StringBuilder(s.substring(start, end + 1));
        sb1.reverse();
        if (sb1.toString().equals(sb2.toString()))
            return true;

        return false;

    }
}