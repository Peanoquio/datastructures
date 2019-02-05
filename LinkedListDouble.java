package datastructures;

import datastructures.Node;

/**
 * The doubly linked list class
 * @param <T>
 */
class LinkedListDouble<T extends Comparable<T>> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    /**
     * The constructor
     * @param data
     */
    public LinkedListDouble(T data) {
        this.head = new Node<T>(data);
        this.tail = this.head;
        this.size = 0;
    }

    /**
     * Push the data to the linked list (will auto-add nodes)
     * @param data
     */
    public void push(T data) {
        if (this.head == null) {
            this.head = new Node<T>(data);
            this.tail = this.head;
        } else {
            // set the new tail
            Node<T> newNode = new Node<>(data);
            this.tail.setNext(newNode);
            newNode.setPrev(this.tail);
            this.tail = newNode;
        }
        ++this.size;
    }

    /**
     * Insert the node into the linked list
     * @param data
     * @param index
     */
    public void insert(T data, int index) {
        try {
            if (index > this.size) {
                throw new Exception("Index having value:" + index + "  is beyond the linked list size:" + this.size);
            }
    
            Node<T> node = null;
            if (index < (int)(this.size / 2)) {
                int counter = 0;
                // start from head
                node = this.head;
                while (node != null) {
                    if (counter == index) {
                        break;
                    }
                    node = node.getNext();
                    ++counter;
                } // end loop
            } else {
                int counter = this.size;
                // start from tail
                node = this.tail;
                while (node != null) {
                    if (counter == index) {
                        break;
                    }
                    node = node.getPrev();
                    --counter;
                } // end loop
            }
    
            if (node != null) {
                // insert the new node in between existing nodes
                Node<T> newNode = new Node<>(data);
                Node<T> nextNode = node.getNext();
                newNode.setNext(nextNode);
                newNode.setPrev(node);
                node.setNext(newNode);
                if (nextNode != null) {
                    nextNode.setPrev(newNode);
                }
                ++this.size;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Get the size of the linked list
     * @return
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Get the head node
     */
    public Node<T> getHead() {
        return this.head;
    }

    /**
     * Get the tail node
     */
    public Node<T> getTail() {
        return this.tail;
    }

    /**
     * Print out the values in the linked list
     * @param linkedList
     */
    public static void PrintValues(LinkedListDouble linkedList) {
        Node node = linkedList.getHead();
        while (node != null) {
            System.out.print(node.getValue() + ", ");
            node = node.getNext();
        } // end loop
    }

} // end class

