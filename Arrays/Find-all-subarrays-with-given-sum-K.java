class Solution {

    public static void findAllSubArr(int input[], int n, int k) {

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