/*
Link : https://practice.geeksforgeeks.org/problems/lcm-and-gcd4516/1
*/
class Solution {
    static Long[] lcmAndGcd(Long A, Long B) {

        Long ans1 = GCD(A, B);
        Long ans2 = (A * B) / ans1;
        Long[] arr = new Long[2];
        arr[0] = ans2;
        arr[1] = ans1;
        return arr;

    }

    public static Long GCD(Long a, Long b) {
        if (b == 0)
            return a;

        return GCD(b, a % b);
    }
};