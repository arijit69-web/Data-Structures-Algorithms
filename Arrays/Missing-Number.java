/*

Link : https://leetcode.com/problems/missing-number/description/

*/
class Solution {
    public int missingNumber(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (i != nums[i])
                return i;
        }
        return nums.length;

    }
}