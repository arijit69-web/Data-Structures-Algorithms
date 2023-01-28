public class Counting {

    public static void main(String arr[]) {
        System.out.println("Count Increasing");
        countIncrease(0, 10);
        System.out.println("Count Decreasing");
        countDecrease(0, 10);
    }

    public static void countIncrease(int ind, int n) {
        if (ind == n + 1) {
            return;
        }
        System.out.println(ind);
        countIncrease(ind + 1, n);
    }

    public static void countDecrease(int ind, int n) {
        if (ind == n + 1) {
            return;
        }
        countDecrease(ind + 1, n);
        System.out.println(ind);

    }
}