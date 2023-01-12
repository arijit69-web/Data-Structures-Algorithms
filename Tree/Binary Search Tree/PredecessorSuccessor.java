
/*
Link : https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
*/
class GfG {
    public static void findPreSuc(Node root, Res p, Res s, int key) {
        Node x = predecessorFind(root, key);
        Node y = successorFind(root, key);
        s.succ = y;
        p.pre = x;

    }

    public static Node predecessorFind(Node root, int key) {
        Node ans = null;
        while (root != null) {
            if (root.data >= key) {
                root = root.left;
            } else {
                ans = root;
                root = root.right;

            }
        }
        return ans;
    }

    public static Node successorFind(Node root, int key) {
        Node ans = null;
        while (root != null) {
            if (root.data <= key) {
                root = root.right;
            } else {
                ans = root;
                root = root.left;

            }
        }
        return ans;
    }
}