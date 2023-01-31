/*
Link : https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
*/
class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                st.push('(');
            } else {
                if (st.size() > 0 && st.peek() == '(') {
                    st.pop();
                } else {
                    st.push(')');

                }
            }
        }
        return st.size();
    }
}