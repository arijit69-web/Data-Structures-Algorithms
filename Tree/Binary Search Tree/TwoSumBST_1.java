/*
Link : https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/
*/
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hs = new HashSet<>();
        boolean flag = preorder(root, k, hs);
        return flag;
    }

    public static boolean preorder(TreeNode root, int k, HashSet<Integer> hs) {
        if (root == null)
            return false;

        if (hs.contains(k - root.val))
            return true;

        hs.add(root.val);

        if (preorder(root.left, k, hs))
            return true;
        if (preorder(root.right, k, hs))
            return true;

        return false;

    }
}