/*
Link : https://leetcode.com/problems/binary-search-tree-iterator/ 
*/

class BSTIterator {
    public static Stack<TreeNode> st;

    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        pushAll(root);

    }

    public int next() {
        TreeNode temp = st.peek();
        st.pop();

        if (temp.right != null)
            pushAll(temp.right);

        return temp.val;

    }

    public boolean hasNext() {

        if (st.size() > 0)
            return true;
        return false;
    }

    public static void pushAll(TreeNode node) {
        while (node != null) {
            st.push(node);
            node = node.left;
        }
    }
}
