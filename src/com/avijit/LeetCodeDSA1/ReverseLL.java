package com.avijit.LeetCodeDSA1;


public class ReverseLL {
    // Input = [1,2,3,4,5]
    // output = [5,,4,3,2,1]
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode listNode = new ListNode();
        for (int i = 0; i < nums.length; i++) {
            listNode = ListNode.add(listNode, nums[i]);
        }
        ListNode.printList(listNode);

        reverseList(listNode);
        ListNode.printList(listNode);
    }

    public static ListNode reverseList(ListNode head){
        ListNode rev = null;

        while(head != null){
            ListNode next = head.next;
            head.next = rev;
            rev = head;
            head = next;
        }
        return rev;
    }

}
