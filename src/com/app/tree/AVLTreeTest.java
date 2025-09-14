package com.app.tree;

public class AVLTreeTest {
    public static void main(String[] args) {
        AVLTree tree = new AVLTree();

        tree.insert(10);
        tree.insert(20);
        tree.insert(30);
        tree.insert(40);
        tree.insert(50);
        tree.insert(25);

        System.out.print("In-order traversal of AVL Tree: ");
        tree.printTree();
    }
}
