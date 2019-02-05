package datastructures;

/**
 * The Node class
 * @param <T>
 */
class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> left;
    private Node<T> right;

    /**
     * The constructor
     * @param data
     */
    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    /**
     * Get the data value stored in the node
     */
    public T getValue() {
        return this.data;
    }

    /**
     * Set the left child node / prev node
     * @param node
     */
    public void setLeft(Node<T> node) {
        this.left = node;
    }

    /**
     * Set the right child node / next node
     * @param node
     */
    public void setRight(Node<T> node) {
        this.right = node;
    }

    /**
     * Set the left child node / prev node
     * @param node
     */
    public void setPrev(Node<T> node) {
        this.left = node;
    }

    /**
     * Set the right child node / next node
     * @param node
     */
    public void setNext(Node<T> node) {
        this.right = node;
    }

    /** 
     * Get the left child node / prev node
    */
    public Node<T> getLeft() {
        return this.left;
    }

    /**
     * Get the right child node / next node
     */
    public Node<T> getRight() {
        return this.right;
    }

    /** 
     * Get the left child node / prev node
    */
    public Node<T> getPrev() {
        return this.left;
    }

    /**
     * Get the right child node / next node
     */
    public Node<T> getNext() {
        return this.right;
    }

    /**
     * Insert the value to the nde (BST structure)
     * @param data
     */
    public void insertToBST(T data) {
        if (this.data == null) {
            this.data = data;
        } else {
            if (data.compareTo(this.data) <= 0) {
                // go left
                if (this.left != null) {
                    // recursion
                    this.left.insertToBST(data);
                } else {
                    this.left = new Node<T>(data);
                }
            } else {
                // go right
                if (this.right != null) {
                    // recursion
                    this.right.insertToBST(data);
                } else {
                    this.right = new Node<T>(data);
                }
            }
        }
    }

} // end class