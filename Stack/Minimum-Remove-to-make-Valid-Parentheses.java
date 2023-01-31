/*
Link : https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/
*/

class Pair {
    int i = 0;
    char c = ' ';

    Pair(int i, char c) {
        this.i = i;
        this.c = c;
    }
}

class Solution {
    public String minRemoveToMakeValid(String str) {

        Stack<Pair> st = new Stack<>();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')' || str.charAt(i) == '(') {
                char c = str.charAt(i);
                if (c == '(') {
                    st.push(new Pair(i, c));
                } else {
                    if (st.size() > 0 && st.peek().c == '(') {
                        st.pop();
                    } else {
                        st.push(new Pair(i, ')'));

                    }
                }
            }

        }
        char[] arr = str.toCharArray();
        while (st.size() > 0) {
            int idx = st.pop().i;
            System.out.println(idx);

            arr[idx] = '#';
        }
        String temp = String.valueOf(arr);
        String ans = temp.replaceAll("#", "");

        return ans;
    }
}