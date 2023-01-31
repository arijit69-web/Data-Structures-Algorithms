class Solution {

    public static void findAllSubArr(int input[], int n, int k) {

        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        boolean flag = false;
        List<Integer> initial = new ArrayList<Integer>();
        initial.add(-1);
        map.put(0, initial);
        int preSum = 0;

        // Loop across all elements of the array
        for (int i = 0; i < input.length; i++) {
            preSum += input[i];
            // If point where sum = (preSum - k) is present, it means that between that
            // point and this, the sum has to equal k
            if (map.containsKey(preSum - k)) { // Subarray found
                List<Integer> startIndices = map.get(preSum - k);
                for (int start : startIndices) {
                    flag = true;
                    System.out.println("Start: " + (start + 1) + "\tEnd: " + i);
                }
            }

            List<Integer> newStart = new ArrayList<Integer>();
            if (map.containsKey(preSum)) {
                newStart = map.get(preSum);
            }
            newStart.add(i);
            map.put(preSum, newStart);
        }
        System.out.println(map);
        if (!flag)
            System.out.println("No Elemets found in the array");
    }

    public static void main(String[] args) {

        int arr[] = { 0, 0, 1, 2, 3, 0, 0 };
        int n = arr.length;
        int K = 6;
        findAllSubArr(arr, n, K);

    }
}