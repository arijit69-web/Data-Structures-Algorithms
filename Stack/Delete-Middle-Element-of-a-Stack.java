/*
Link : https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1 
*/
class Solution {
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {

        if (sizeOfStack % 2 != 0) {
            delete(s, 1, (sizeOfStack + 1) / 2);
        } else {
            delete(s, 1, ((sizeOfStack) / 2) + 1);

        }

    }

    public static void delete(Stack<Integer> st, int count, int mid) {
        if (count == mid) {
            st.pop();
            return;
        }
        int temp = st.pop();
        delete(st, count + 1, mid);
        st.push(temp);

    }
}
