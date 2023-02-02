/*
Link : https://practice.geeksforgeeks.org/problems/permutation-with-spaces3627/1
*/
class Solution {

    ArrayList<String> permutation(String S) {
        StringBuilder sb = new StringBuilder(S);
        ArrayList<String> al = new ArrayList<>();
        solve(sb, 0, S.length(), al);
        return al;
    }

    public static void solve(StringBuilder sb, int ind, int n, ArrayList<String> al) {
        if (ind == n - 1) {
            al.add(sb.toString());
            return;
        }
        sb.insert(ind + 1, " ");
        solve(sb, ind + 2, n + 1, al);
        sb.deleteCharAt(ind + 1);
        solve(sb, ind + 1, n, al);

    }

}