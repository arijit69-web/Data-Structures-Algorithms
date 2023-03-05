/*
Link : https://leetcode.com/problems/subarray-sum-equals-k/description/
*/
class Solution {
    public int subarraySum(int[] input, int k) {
        int max = 0;
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        boolean flag = false;
        List<Integer> initial = new ArrayList<Integer>();
        initial.add(-1);
        map.put(0, initial);
        int preSum = 0;

        for (int i = 0; i < input.length; i++) {
            preSum += input[i];
            if (map.containsKey(preSum - k)) { // Subarray found
                List<Integer> startIndices = map.get(preSum - k);
                for (int start : startIndices) {
                    max++;
                }
            }

            List<Integer> newStart = new ArrayList<Integer>();
            if (map.containsKey(preSum)) {
                newStart = map.get(preSum);
            }
            newStart.add(i);
            map.put(preSum, newStart);
        }
        return max;
    }
}