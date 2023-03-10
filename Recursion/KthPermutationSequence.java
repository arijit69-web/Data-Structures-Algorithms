/*
Link : https://leetcode.com/problems/permutation-sequence/description/
*/
public class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n + 1];
        StringBuilder sb = new StringBuilder();

        // create an array of factorial lookup
        int mul = 1;
        factorial[0] = 1;
        for (int i = 1; i <= n; i++) {
            mul *= i;
            factorial[i] = mul;
        }
        // factorial[] = {1, 1, 2, 6, 24, ... n!}

        // create a list of numbers to get indices
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        // numbers = {1, 2, 3, 4}

        k--;

        for (int i = 1; i <= n; i++) {
            int index = k / factorial[n - i];
            sb.append(Integer.toString(numbers.get(index)));
            numbers.remove(index);
            k -= index * factorial[n - i];
        }

        return sb.toString();
    }
}