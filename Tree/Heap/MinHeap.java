
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

            int minInd = -1;
            if (lt < rt) {
                minInd = 2 * i + 1;
            } else {
                minInd = 2 * i + 2;
            }

            if (harr[i] > harr[minInd]) {
                int temp = harr[i];
                harr[i] = harr[minInd];
                harr[minInd] = temp;
                i = minInd;
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
                return ;
            }
        }

    }

    public static void main(String args[]) {

        MinHeap heap = new MinHeap(8);
        // Inserting into Heap
        heap.insertKey(24);
        heap.insertKey(18);
        heap.insertKey(38);
        heap.insertKey(43);
        heap.insertKey(14);
        heap.insertKey(40);
        heap.insertKey(1);
        heap.insertKey(54);
        // Sorting
        for (int i = 0; i < 8; i++) {
            System.out.print(heap.extractMin() + " ");

        }

    }

}
