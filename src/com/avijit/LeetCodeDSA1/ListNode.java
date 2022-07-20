package com.avijit.LeetCodeDSA1;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;

    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // method for adding element to ListNode
    public static ListNode add(ListNode head, int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            return newNode;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }
//    public static ListNode add(ListNode head, int val) {
//        ListNode newNode = new ListNode(val);
//        newNode.next = head;
//        return newNode;
//    }

    // method for ListNode print
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + "->");
            head = head.next;
        }
        System.out.println();
    }
}
