package LinkedList.doublyLinkedList;

import static LinkedList.doublyLinkedList.DoublyLinkedListUtils.createDLLFromArray;
import static LinkedList.doublyLinkedList.DoublyLinkedListUtils.printDLL;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {234, 2345, 1345, 34165, 43, 476557};
        Node head = createDLLFromArray(arr);

        printDLL(head);

        head = insertBeginning(head, 20);
        printDLL(head);

        head = insertEnd(head, 20);
        printDLL(head);

        head = insertKth(head, 20, 3);
        printDLL(head);
    }
    public static Node insertBeginning (Node head, int data) {
//        if (head == null )
        Node temp = new Node(data);
        temp.setNext(head);
        head.setPrev(temp);
        head = temp;

        return head;
    }

    public static Node insertEnd (Node head, int data) {
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        Node newNode = new Node(data);
        temp.setNext(newNode);
        newNode.setPrev(temp);

        return head;
    }

    public static Node insertKth (Node head, int data, int k) {
        Node temp = head;
        int i = 1;
        while (i < k - 1) {
            temp = temp.getNext();
            i++;
        }
        Node newNode = new Node(data);
        newNode.setPrev(temp);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        newNode.getNext().setPrev(newNode);

        return head;
    }

}
