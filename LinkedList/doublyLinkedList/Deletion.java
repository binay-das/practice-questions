package LinkedList.doublyLinkedList;

import static LinkedList.doublyLinkedList.DoublyLinkedListUtils.*;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = {234, 2345, 1345, 34165, 43, 476557};
        Node head = createDLLFromArray(arr);

        printDLL(head);

        head = deleteBeginning(head);
        printDLL(head);

        head = deleteEnd(head);
        printDLL(head);

        head = deleteKth(head, 3);
        printDLL(head);

        deleteNode(head.getNext());
        printDLL(head);
    }
    public static Node deleteBeginning (Node head) {
        if (head == null || head.getNext() == null) {
            return null;
        }
        Node temp = head;
        head = head.getNext();
        head.setPrev(null);
        temp.setNext(null);

        return head;
    }

    public static Node deleteEnd (Node head) {
        if (head == null || head.getNext() == null) {
            return null;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.getPrev().setNext(null);
        temp.setPrev(null);

        return head;
    }

    public static Node deleteKth (Node head, int k) {
        if (head == null || head.getNext() == null) {
            return null;
        }
        if (k < 1 || k > lengthDLL(head)) {
            return head;
        }
        if (k == 1) {
            return deleteBeginning(head);
        }
        if (k == lengthDLL(head)) {
            return deleteEnd(head);
        }
        Node temp = head;
        int i = 1;
        while (i < k - 1) {
            temp = temp.getNext();
            i++;
        }
        temp.setNext(temp.getNext().getNext());
        temp.getNext().setPrev(temp);

        return head;
    }

    public static void deleteNode (Node node){
        // it is given that the node is not the head node.

        if (node == null) {
            return;
        }

        if (node.getNext() == null) {
            node.getPrev().setNext(null);
            node.setPrev(null);

            return;
        }
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
    }
}
