package com.app.tree;
class AVLTree {

    private Node root;

    // Get the height of a node
    private int height(Node node) {
        return (node == null) ? 0 : node.height;
    }

    // Get balance factor of node
    private int getBalance(Node node) {
        return (node == null) ? 0 : height(node.left) - height(node.right);
    }

    // Right rotate (LL Rotation)
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left rotate (RR Rotation)
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert a node
    public Node insert(Node node, int key) {
        // Perform normal BST insertion
        if (node == null) {
            return new Node(key);
        }

        if (key < node.key) {
            node.left = insert(node.left, key);
        } else if (key > node.key) {
            node.right = insert(node.right, key);
        } else {
            return node; // Duplicate keys not allowed
        }

        // Update height of current node
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Get balance factor
        int balance = getBalance(node);

        // **4 Cases to handle imbalance**

        // **LL Rotation (Left Heavy)**
        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        // **RR Rotation (Right Heavy)**
        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        // **LR Rotation (Left-Right)**
        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // **RL Rotation (Right-Left)**
        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // No rotation needed
    }

    // Wrapper function for insertion
    public void insert(int key) {
        root = insert(root, key);
    }

    // In-order traversal (for testing)
    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.key + " ");
            inOrder(node.right);
        }
    }

    // Print tree in-order
    public void printTree() {
        inOrder(root);
        System.out.println();
    }

    // Main method to test AVL Tree

}

