package com.avijit.Trees;

public class BinaryHeap {
    int[] heap;
    int size;
    int maxsize;

    public BinaryHeap(int maxsize) {
        this.maxsize = maxsize;
        this.size = 0;
        heap = new int[this.maxsize];
    }

    public void insert(int element) {
        heap[size] = element;
        size++;
        int i = size - 1;
        while(i > 0 && heap[i] > heap[(i - 1) / 2]) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    public int remove() {
        int root = heap[0];
        heap[0] = heap[size - 1];
        size--;
        int i = 0;
        while(i < size / 2) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            if(right < size && heap[right] > heap[left]) {
                swap(i, right);
                i = right;
            } else {
                swap(i, left);
                i = left;
            }
        }
        return root;
    }

    public void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void display() {
        for(int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    // main method for Binary heap
    public static void main(String[] args) {
        BinaryHeap heap = new BinaryHeap(11);
        int[] arr = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17};
        for (int x :
                arr) {
            heap.insert(x);
        }
//        heap.insert(10);
//        heap.insert(4);
//        heap.insert(9);
//        heap.insert(1);
//        heap.insert(7);
//        heap.insert(5);
//        heap.insert(3);

        heap.display();
        heap.remove();
        heap.display();
    }


}
