/*
Link : https://practice.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=union-of-two-sorted-arrays
*/
class Solution {
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {

        TreeMap<Integer, Integer> ans = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            ans.put(arr1[i], 0);

        }
        for (int i = 0; i < m; i++) {
            ans.put(arr2[i], 0);

        }
        ArrayList<Integer> listOfKeys = new ArrayList<Integer>(ans.keySet());
        return listOfKeys;

    }
}
