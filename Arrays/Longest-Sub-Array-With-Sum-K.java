/*
Link : https://practice.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k
*/
class Solution {

    // Function for finding maximum and value pair
    public static int lenOfLongSubarr(int input[], int n, int k) {
        int max = 0;
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        boolean flag = false;
        List<Integer> initial = new ArrayList<Integer>();
        initial.add(-1);
        map.put(0, initial);
        int preSum = 0;

        for (int i = 0; i < input.length; i++) {
            preSum += input[i];
            if (map.containsKey(preSum - k)) {
                List<Integer> startIndices = map.get(preSum - k);
                for (int start : startIndices) {
                    flag = true;
                    max = Math.max(max, i - (start + 1) + 1);
                }
            }

            List<Integer> newStart = new ArrayList<Integer>();
            if (map.containsKey(preSum)) {
                newStart = map.get(preSum);
            }
            newStart.add(i);
            map.put(preSum, newStart);
        }
        if (!flag)
            return 0;

        return max;
    }

}
