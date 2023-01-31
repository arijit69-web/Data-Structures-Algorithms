
/*
Link : https://www.geeksforgeeks.org/length-of-smallest-subsequence-such-that-sum-of-elements-is-greater-than-equal-to-k/
*/
import java.util.*;

class GFG {

    // Function to find the smallest
    // subsequence such that sum of elements
    // is greater than equal to given number K
    static int lengthOfSmallestSubsequence(int K, int[] v) {
        // Initialize priority queue [Max Heap]
        Queue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        // Loop to insert all elements into the priority queue
        for (int i = 0; i < v.length; i++) {
            pq.add(v[i]);
        }
        int sum = 0, count = 0;

        // Loop to find the smallest subsequence such that sum of elements is greater
        // than equal to given number K
        while (!pq.isEmpty() && sum < K) {
            sum += pq.peek();
            pq.remove();
            count++;
        }

        // If sum is less than K then return -1 else return count.
        if (sum < K) {
            return -1;
        }
        return count;
    }

    // Driver code
    public static void main(String[] args) {
        int[] v = { 2, 3, 1, 5,
                6, 3, 7, 9,
                14, 10, 2, 5 };
        int K = 35;
        System.out.print(lengthOfSmallestSubsequence(K, v));
    }
}
