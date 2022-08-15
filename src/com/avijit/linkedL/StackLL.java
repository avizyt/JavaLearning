package com.avijit.linkedL;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StackLL {
    private LinkedList<Integer> list;
    private int CAPACITY;
    private int n;

    public StackLL(int capacity) {
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

    public void push(Integer item) {
        list.add(item);
        n++;
    }

    public Integer pop() {
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        n--;
        return list.removeLast();
    }

    public Integer peek(){
        if (isEmpty()) throw new NoSuchElementException("Stack underflow");
        return list.getLast();
    }

    public String toString(){
        return list.toString();
    }

    public Iterator<Integer> iterator(){
        return list.iterator();
    }

    public static void main(String[] args) {
        StackLL stack = new StackLL(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        System.out.println(stack.size());
        System.out.println(stack);
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
        Iterator<Integer> it = stack.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        System.out.println(stack);
    }
}
