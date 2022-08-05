package com.avijit.Trees;

public class TreeTesting {
    public static void main(String[] args) {
        int[] arr = {11, 44, 33, 22, 77, 66, 55};

        Tree root = new Tree(arr[0]);

        for (int i = 1; i <= 3; i++) {
            root.insertLeft(new Tree(arr[i]));
        }

        for (int i = 4; i <= 6; i++) {
            root.insertRight(new Tree(arr[i]));
        }


        // root value -> 10
        System.out.println("Root -> " + root.getNodeValue());

        // left subtree values
        System.out.println("\nLeft Subtree: ");
        System.out.println(root.getLeftChild().getNodeValue());
        System.out.println(root.getLeftChild().getLeftChild().getNodeValue());
        System.out.println(root.getLeftChild().getLeftChild().getLeftChild().getNodeValue());

        // right subtree values
        System.out.println("\nRight Subtree: ");
        System.out.println(root.getRightChild().getNodeValue());
        System.out.println(root.getRightChild().getRightChild().getNodeValue());
        System.out.println(root.getRightChild().getRightChild().getRightChild().getNodeValue());

        System.out.println("===================================");
        System.out.println(root.getLeftChild().getRightChild().getNodeValue());
    }
}
