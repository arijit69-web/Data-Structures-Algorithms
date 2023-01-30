/*
Link : https://practice.geeksforgeeks.org/problems/sort-the-array0055/1
*/

class Solution {
    int[] sortArr(int[] arr, int n) {
        sort(arr);
        return arr;

    }

    public static void sort(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : arr) {
            al.add(i);
        }

        sortSolve(al);
        int t = 0;
        for (int i : al) {
            arr[t++] = i;
        }

    }

    public static void sortSolve(ArrayList<Integer> al) {
        if (al.size() == 0)
            return;

        int temp = al.get(0);
        al.remove(0);
        sortSolve(al);
        insert(temp, al);
    }

    public static void insert(int t, ArrayList<Integer> al) {
        if (al.size() == 0 || al.get(al.size() - 1) <= t) {
            al.add(t);
            return;
        }
        int temp = al.get(al.size() - 1);
        al.remove(al.size() - 1);
        insert(t, al);
        al.add(temp);
    }
}