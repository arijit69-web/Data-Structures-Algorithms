/*
Link : https://practice.geeksforgeeks.org/problems/print-n-bit-binary-numbers-having-more-1s-than-0s0252/1
*/
class Solution {
    ArrayList<String> NBitBinary(int N) {
        StringBuilder sb = new StringBuilder("");
        ArrayList<String> al = new ArrayList<>();

        solve(sb, 0, 0, N, al);
        Collections.sort(al);
        Collections.reverse(al);

        return al;

    }

    public static void solve(StringBuilder sb, int one, int zero, int n, ArrayList<String> al) {
        if (one + zero == n) {
            al.add(sb.toString());
            return;
        }
        if (one < n) {
            sb.append("1");

            solve(sb, one + 1, zero, n, al);
            sb.deleteCharAt(sb.length() - 1);
        }
        if (one > zero) {
            sb.append("0");
            solve(sb, one, zero + 1, n, al);
            sb.deleteCharAt(sb.length() - 1);
        }

    }
}