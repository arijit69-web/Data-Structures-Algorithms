class Pair {
    int v1 = 0, v2 = 0;

    Pair(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
}

class Solution {
    public int[] topK(int[] nums, int k) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Pair> al = new PriorityQueue<>((a, b) -> {
            if (a.v2 == b.v2)
                return b.v1 - a.v1;

            return b.v2 - a.v2;
        });
        for (int y : hm.keySet()) {
            al.add(new Pair(y, hm.get(y)));
        }
        int ans[] = new int[k];
        int t = 0;
        while (k != 0) {
            Pair p = al.remove();
            ans[t++] = p.v1;
            k--;
        }
        return ans;
    }
}