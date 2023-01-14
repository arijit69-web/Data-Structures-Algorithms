/*
Link : https://practice.geeksforgeeks.org/problems/bubble-sort/1
*/

public class MinHeap {
    int[] harr;
    int capacity;
    int heap_size;

    MinHeap(int cap) {
        heap_size = 0;
        capacity = cap;
        harr = new int[cap];
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    int left(int i) {
        return (2 * i + 1);
    }

    int right(int i) {
        return (2 * i + 2);
    }

    int extractMin() {
        if (heap_size == 0)
            return -1;
        int ans = harr[0];
        harr[0] = harr[heap_size - 1];
        harr[heap_size - 1] = Integer.MAX_VALUE;
        heap_size--;
        int i = 0;
        while (2 * i + 1 < heap_size) {
            int lt = harr[left(i)];
            int rt = harr[right(i)];

            int large = -1;
            if (lt < rt) {
                large = 2 * i + 1;
            } else {
                large = 2 * i + 2;
            }

            if (harr[i] > harr[large]) {
                int temp = harr[i];
                harr[i] = harr[large];
                harr[large] = temp;
                i = large;
            } else {
                return ans;
            }
        }

        return ans;
    }

    void insertKey(int k) {
        if (heap_size == capacity)
            return;
        heap_size++;

        harr[heap_size - 1] = k;

        int i = heap_size - 1;

        while (i > 0) {
            int par = parent(i);
            if (harr[par] > harr[i]) {
                int temp = harr[par];
                harr[par] = harr[i];
                harr[i] = temp;
                i = par;

            } else {
                return;
            }
        }

    }

}

class Solution {
    public static void bubbleSort(int a[], int n) {
        MinHeap heap = new MinHeap(n);
        for (int i = 0; i < n; i++) {
            heap.insertKey(a[i]);
        }
        for (int i = 0; i < n; i++) {
            a[i] = heap.extractMin();
        }
    }

}