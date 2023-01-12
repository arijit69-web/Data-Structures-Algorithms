/*
Link : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
*/
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;
        int curr = root.val;
        if (root.val < p.val && root.val < q.val) {
            TreeNode rt = lowestCommonAncestor(root.right, p, q);
            return rt;
        } else if (root.val > p.val && root.val > q.val) {
            TreeNode lt = lowestCommonAncestor(root.left, p, q);
            return lt;
        }

        return root;

    }
}
