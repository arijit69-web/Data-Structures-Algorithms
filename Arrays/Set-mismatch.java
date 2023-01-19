/*

Link : https://leetcode.com/problems/set-mismatch/description/

*/
class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int arr[] = new int[2];
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (correct < nums.length && nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;

            } else {
                i++;
            }
        }
        for (i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                arr[0] = nums[i];
                arr[1] = i + 1;
            }
        }
        return arr;

    }
}