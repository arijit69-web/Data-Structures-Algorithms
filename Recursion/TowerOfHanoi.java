/*
Link : https://practice.geeksforgeeks.org/problems/tower-of-hanoi-1587115621/1
*/
class Hanoi {

    public long toh(int N, int from, int to, int aux) {

        solve(N, from, aux, to);
        return (long) Math.pow(2, N) - 1;
    }

    public static void solve(int N, int from, int help, int to) {
        if (N == 1) {
            System.out.println("move disk " + N + " from rod " + from + " to rod " + to);

            return;
        }

        solve(N - 1, from, to, help);
        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        solve(N - 1, help, from, to);

    }
}
