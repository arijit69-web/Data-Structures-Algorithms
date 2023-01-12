/*
Link : https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
*/

class BSTIterator {
    Stack<TreeNode> st;
    boolean flag = true;

    public BSTIterator(TreeNode root, boolean flagVal) {
        st = new Stack<>();
        flag = flagVal;
        pushAll(root);

    }

    public int next() {
        TreeNode temp = null;
        temp = st.pop();

        pushAll(temp.right);

        return temp.val;

    }

    public int prev() {
        TreeNode temp = null;
        temp = st.pop();

        pushAll(temp.left);

        return temp.val;

    }

    public void pushAll(TreeNode node) {
        if (flag) {
            while (node != null) {
                st.push(node);
                node = node.left;
            }
        } else {
            while (node != null) {
                st.push(node);
                node = node.right;
            }

        }

    }
}

class Solution {
    public boolean findTarget(TreeNode root, int k) {
        BSTIterator start = new BSTIterator(root, true);
        BSTIterator end = new BSTIterator(root, false);

        int s = start.next();
        int e = end.prev();

        while (s < e) {
            if (s + e == k)
                return true;
            else if (s + e > k)
                e = end.prev();
            else
                s = start.next();
        }

        return false;

    }
}