import java.util.*;

public class Solution {

    public static void main(String[] args) {

        printDivisorsOptimal(36);

    }

    public static void printDivisorsOptimal(int n) {

        System.out.println("The divisors of " + n + " are:");
        for (int i = 1; i <= (int) Math.sqrt(n); i++)
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i)
                    System.out.print(n / i + " ");
            }

        System.out.println();
    }

}