/*
Link : https://www.codingninjas.com/codestudio/problems/tug-of-war_985253?leftPanelTab=0
*/
import java.util.ArrayList;

public class Solution {
    public static int tugOfWar(ArrayList<Integer> arr, int n) {
        int minDiff[] = { Integer.MAX_VALUE };
        int sum1[] = { 0 };
        int sum2[] = { 0 };
        ArrayList<Integer> set1 = new ArrayList<>();
        ArrayList<Integer> set2 = new ArrayList<>();
        solve(arr, 0, set1, set2, sum1, sum2, n, minDiff);
        return minDiff[0];

    }

    public static void solve(ArrayList<Integer> arr, int i, ArrayList<Integer> set1, ArrayList<Integer> set2,
            int sum1[], int sum2[], int n, int minDiff[]) {
        if (i == n) { //B.C.
            minDiff[0] = Math.min(minDiff[0], Math.abs(sum1[0] - sum2[0]));//Finding the minimum absolute difference b/w 2 sum of subsets set1 & set2
            return;
        }
        if (set1.size() < (n + 1) / 2) {
            set1.add(arr.get(i)); // storing the current index element in set1 
            sum1[0] = sum1[0] + arr.get(i); // adding the current index element in sum1
            solve(arr, i + 1, set1, set2, sum1, sum2, n, minDiff);
            sum1[0] = sum1[0] - set1.get(set1.size() - 1);// Backtrack - subtracting the last index element of set1 from sum1
            set1.remove(set1.size() - 1);// Backtrack - removing the last index element from set1

        }
        if (set2.size() < (n + 1) / 2) {
            set2.add(arr.get(i));// storing the current index element in set2
            sum2[0] = sum2[0] + arr.get(i);// adding the current index element in sum2
            solve(arr, i + 1, set1, set2, sum1, sum2, n, minDiff);
            sum2[0] = sum2[0] - set2.get(set2.size() - 1);// Backtrack - subtracting the last index element of set1 from sum1
            set2.remove(set2.size() - 1);// Backtrack - removing the last index element from set1

        }
    }
}