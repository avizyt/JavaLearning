package com.avijit.linkedL;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueLL implements Iterable<Integer> {
    private LinkedList<Integer> list;
    private int n;
    private int CAPACITY;

    public QueueLL(int capacity) {
        this.CAPACITY = capacity;
        list = new LinkedList<Integer>();
        n = 0;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int size() {
        return n;
    }

    public void enqueue(Integer item) {
        list.add(item);
        n++;
    }

    public Integer dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        n--;
        return list.removeFirst();
    }

    public Integer peek(){
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        return list.getFirst();
    }

    public String toString(){
        return list.toString();
    }


    @Override
    public Iterator<Integer> iterator() {
        return list.iterator();
    }

    public static void main(String[] args) {
        QueueLL queue = new QueueLL(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);
        System.out.println(queue.size());
        System.out.println(queue);
        Iterator<Integer> it = queue.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
