/*
Link : https://www.codingninjas.com/codestudio/problems/minimum-cost-to-make-string-valid_1115770?leftPanelTab=0
*/
import java.util.*;

public class Solution {
    public static int findMinimumCost(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length() % 2 != 0)
            return -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{') {
                st.push('{');
            } else {
                if (st.size() > 0 && st.peek() == '{') {
                    st.pop();
                } else {
                    st.push('}');

                }
            }
        }
        if (st.size() % 2 != 0)
            return -1;
        int a = 0;
        int b = 0;

        while (st.size() > 0) {
            if (st.peek() == '{')
                a++;
            else
                b++;
            st.pop();
        }
        int ans = ((a + 1) / 2) + ((b + 1) / 2);

        return ans;

    }
}