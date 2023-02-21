/*
Link : https://practice.geeksforgeeks.org/problems/prime-number2314/1
*/

class Solution {
    static int isPrime(int n) {
        if (n <= 1)
            return 0;

        else if (n == 2)
            return 1;

        else if (n % 2 == 0)
            return 0;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return 0;
        }
        return 1;

    }
}