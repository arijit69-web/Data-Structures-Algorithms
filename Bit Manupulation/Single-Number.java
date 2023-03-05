/*
Link : https://leetcode.com/problems/single-number/description/
*/
class Solution {
    public int singleNumber(int[] nums) {
        int miss = nums[0];
        for (int i = 1; i < nums.length; i++) {
            miss = miss ^ nums[i];
        }
        return miss;
    }
}