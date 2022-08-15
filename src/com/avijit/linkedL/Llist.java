package com.avijit.linkedL;

public class Llist {

    private static class Node{
        private Integer item;
        private Node next;
    }

    private Node first;
    private int n;

    public Llist() {
        first = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public void add(Integer item){
        Node temp = first;
        first = new Node();
        first.item = item;
        first.next = temp;
        n++;
    }

    public void remove(Integer item){
        Node current = first;
        Node previous = null;
        while(current.item != item){
            previous = current;
            current = current.next;
        }
        if(previous == null){
            first = first.next;
        }else{
            previous.next = current.next;
        }
        n--;
    }

    public void display(){
        for(Node temp = first; temp != null; temp = temp.next){
            System.out.print(temp.item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Llist llist = new Llist();
        llist.add(1);
        llist.add(2);
        llist.add(3);
        llist.add(4);
        llist.add(5);
        llist.add(6);
        llist.add(7);
        llist.add(8);
        llist.add(9);
        llist.add(10);
        llist.display();
        for (Node x = llist.first; x != null; x = x.next) {
            System.out.print(x.item + " ");
        }
    }
}
