/*
Link : https://practice.geeksforgeeks.org/problems/reverse-bits3556/1
*/
class Solution {
    static Long reversedBits(Long X) {
        String binary = Long.toBinaryString(X);
        while (binary.length() < 32) {
            binary = "0" + binary;
        }
        StringBuilder stringBuild = new StringBuilder(binary);
        stringBuild.reverse();
        Long ans = Long.parseLong(stringBuild.toString(), 2);

        return ans;

    }
};