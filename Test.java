package datastructures;

import java.util.ArrayList;
import datastructures.*;


/**
 * The class to perform testing
 */
class Test {
    public static void main(String args[]) {
        System.out.println("TestLinkedList");
        Test.TestLinkedList();

        System.out.println();

        System.out.println("TestBst");
        Test.TestBst();
    }

    /**
     * Test the linked list
     */
    private static void TestLinkedList() {
        LinkedListDouble<String> linkedListDbl = new LinkedListDouble<>("a");
        linkedListDbl.push("b");
        linkedListDbl.push("c");
        linkedListDbl.push("d");
        linkedListDbl.push("e");

        linkedListDbl.insert("x", 1);
        linkedListDbl.insert("y", 4);
        linkedListDbl.insert("z", 6);

        LinkedListDouble.PrintValues(linkedListDbl);
    }

    /**
     * Test the BST
     */
    private static void TestBst() {
        BST<Integer> bst = new BST<>(5);
        bst.insert(8);
        bst.insert(4);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(2);
        bst.insert(9);
        bst.insert(10);

        // BST InOrderTraversal
        System.out.println("BST InOrderTraversal");
        ArrayList<Integer> arrList = new ArrayList<>();
        BST.InOrderTraversal(bst.getRoot(), arrList);
        for (Integer num : arrList) {
            System.out.print(num + ", ");
        } // end loop
        System.out.println("");

        // BST PreOrderTraversal
        System.out.println("BST PreOrderTraversal");
        arrList = new ArrayList<>();
        BST.PreOrderTraversal(bst.getRoot(), arrList);
        for (Integer num : arrList) {
            System.out.print(num + ", ");
        } // end loop
        System.out.println("");

        // BST PostOrderTraversal
        System.out.println("BST PostOrderTraversal");
        arrList = new ArrayList<>();
        BST.PostOrderTraversal(bst.getRoot(), arrList);
        for (Integer num : arrList) {
            System.out.print(num + ", ");
        } // end loop
        System.out.println("");
    }

} // end class
