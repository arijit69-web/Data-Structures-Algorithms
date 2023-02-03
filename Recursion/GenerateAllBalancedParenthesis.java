/*
Link : https://leetcode.com/problems/generate-parentheses/
*/
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder("");
        solve(0, 0, sb, al, n);
        return al;
    }

    public static void solve(int open, int close, StringBuilder s, List<String> al, int n) {
        if (open == n && close == n) {

            al.add(s.toString());
            return;
        }

        if (open < n) {

            s.append("(");
            solve(open + 1, close, s, al, n);
            s.deleteCharAt(s.length() - 1);

        }

        if (open > close) {

            s.append(")");
            solve(open, close + 1, s, al, n);
            s.deleteCharAt(s.length() - 1);

        }

    }
}