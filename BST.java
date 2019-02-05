package datastructures;

import java.util.ArrayList;

import datastructures.Node;

/**
 * The binary search tree class
 * @param <T>
 */
class BST<T extends Comparable<T>> {
    private Node<T> root;

    /**
     * The constructor
     * @param data
     */
    public BST(T data) {
        this.root = new Node<T>(data);
    }

    /**
     * Get the root node
     * @return
     */
    public Node<T> getRoot() {
        return this.root;
    }

    /**
     * Insert to the BST
     * @param data
     */
    public void insert(T data) {
        this.root.insertToBST(data);
    }

    /**
     * Perform an in-order traversal of the BST
     * This will also populate the array list
     * In case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order. 
     * @param node
     * @param arrList
     * @return
     */
    public static <T extends Comparable<T>> boolean InOrderTraversal(Node<T> node, ArrayList<T> arrList) {
        if (node == null || node.getValue() == null) {
            return false;
        }
        BST.InOrderTraversal(node.getLeft(), arrList);
        arrList.add(node.getValue());
        BST.InOrderTraversal(node.getRight(), arrList);

        return true;
    }

    /**
     * Perform a pre-order traversal of the BST
     * This will also populate the array list
     * Preorder traversal is used to create a copy of the tree. 
     * Preorder traversal is also used to get prefix expression on of an expression tree. 
     * @param node
     * @param arrList
     * @return
     */
    public static <T extends Comparable<T>> boolean PreOrderTraversal(Node<T> node, ArrayList<T> arrayList) {
        if (node == null || node.getValue() == null) {
            return false;
        }
        arrayList.add(node.getValue());
        BST.PreOrderTraversal(node.getLeft(), arrayList);
        BST.PreOrderTraversal(node.getRight(), arrayList);

        return true;
    }

    /**
     * Perform a post-order traversal of the BST
     * This will also populate the array list
     * Postorder traversal is used to delete the tree.
     * @param node
     * @param arrList
     * @return
     */
    public static <T extends Comparable<T>> boolean PostOrderTraversal(Node<T> node, ArrayList<T> arrayList) {
        if (node == null || node.getValue() == null) {
            return false;
        }
        BST.PostOrderTraversal(node.getLeft(), arrayList);
        BST.PostOrderTraversal(node.getRight(), arrayList);
        arrayList.add(node.getValue());
        
        return true;
    }

} // end class