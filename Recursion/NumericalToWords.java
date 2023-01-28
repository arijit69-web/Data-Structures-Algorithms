public class NumericalToWords {

    public static void main(String arr[]) {
        int n = 1234;
        solve(n);
    }

    public static void solve(int n) {
        if (n == 0) {
            return;
        }
        int x = n % 10;
        solve(n / 10);
        if (x == 1) {
            System.out.print("One ");
        } else if (x == 2) {
            System.out.print("Two ");
        } else if (x == 3) {
            System.out.print("Three ");
        } else if (x == 4) {
            System.out.print("Four ");
        } else if (x == 5) {
            System.out.print("Five ");
        } else if (x == 6) {
            System.out.print("Six ");
        } else if (x == 7) {
            System.out.print("Seven ");
        } else if (x == 8) {
            System.out.print("Eignt ");
        } else if (x == 9) {
            System.out.print("Nine ");
        } else {
            System.out.print("INVALID ");

        }

    }

}