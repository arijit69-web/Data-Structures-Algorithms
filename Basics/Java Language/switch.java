/* Link : https://practice.geeksforgeeks.org/problems/java-switch-case-statement3529/1 */

class Solution {
    static double switchCase(int choice, List<Double> arr) {
        switch (choice) {

            case 1:
                return Math.PI * arr.get(0) * arr.get(0);

            case 2:
                return arr.get(0) * arr.get(1);
        }
        return 0.0;
    }
}