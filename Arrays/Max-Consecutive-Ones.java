/*
Link : https://leetcode.com/problems/max-consecutive-ones/description
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int n = nums.length;
        int count = 0;
        int max = 0;
        for (int i = 0; i < n - 1; i++) {
            if ((nums[i] == 1 || nums[i + 1] == 1) && count == 0)
                count = 1;
            if (nums[i] == 1 && nums[i + 1] == 1) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;

            }
        }
        max = Math.max(count, max);
        return max;
    }
}