package com.avijit.Trees;

public class TreeTraverser {

    public static void preOrder(Tree root){
        if (root != null){
            System.out.println(root.getNodeValue() + " ");
            preOrder(root.getLeftChild());
            preOrder(root.getRightChild());
        }
    }

    public static void inOrder(Tree root) {
        if (root != null){
            inOrder(root.getLeftChild());
            System.out.println(root.getNodeValue() + " ");
            inOrder(root.getRightChild());
        }
    }

    public static void postOrder(Tree root){
        if (root != null){
            postOrder(root.getLeftChild());
            postOrder(root.getRightChild());
            System.out.println(root.getNodeValue());
        }
    }


    public static void main(String[] args) {
        int[] arr = {11, 44, 33, 22, 77, 66, 55};

        Tree root = new Tree(arr[0]);

        for (int i = 1; i <= 3; i++) {
            root.insertLeft(new Tree(arr[i]));
        }

        for (int i = 4; i <= 6; i++) {
            root.insertRight(new Tree(arr[i]));
        }

        // Pre-order traversal
        System.out.println("\nPre-order traversal: ");
        TreeTraverser.preOrder(root);

        // In-order traversal
        System.out.println("\n\nIn-order traversal: ");
        TreeTraverser.inOrder(root);

        // Post-order traversal
        System.out.println("\n\nPost-order traversal: ");
        TreeTraverser.postOrder(root);
    }
}
