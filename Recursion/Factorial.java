public class Factorial {

    public static void main(String arr[]) {

        System.out.println("Factorial : " + factorial(1, 7));
    }

    public static int factorial(int ind, int n) {
        if (ind == n) {
            return n;
        }
        int fact = ind * factorial(ind + 1, n);
        return fact;

    }

}