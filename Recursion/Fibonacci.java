public class Fibonacci {

    public static void main(String arr[]) {

        for (int i = 0; i <= 8; i++) {
            System.out.println(fibonacci(i));

        }
    }

    public static int fibonacci(int ind) {
        if (ind == 0 || ind == 1) {
            return ind;
        }
        int num1 = fibonacci(ind - 1);
        int num2 = fibonacci(ind - 2);
        return num1 + num2;

    }

}