package LinkedList.doublyLinkedList;

import static LinkedList.doublyLinkedList.DoublyLinkedListUtils.*;

class Node {
    private int data;
    private Node prev;
    private Node next;

    Node () {
        data = 0;
        prev = null;
        next = null;
    }
    Node (int data) {
        this.data = data;
        prev = null;
        next = null;
    }
    Node (int data, Node prev, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }

    public int getData () {
        return data;
    }
    public Node getPrev () {
        return prev;
    }
    public void setPrev (Node prev) {
        this.prev = prev;
    }
    public Node getNext () {
        return next;
    }
    public void setNext (Node next) {
        this.next = next;
    }
}

class DoublyLinkedListUtils {
    public static Node createDLLFromArray (int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp1 = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp2 = new Node(arr[i]);
            temp1.setNext(temp2);
            temp2.setPrev(temp1);
            temp1 = temp2;
        }

        return head;
    }
    public static void printDLL (Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " <--> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }
    public static int lengthDLL (Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }

        return count;
    }
}
public class DoublyLinkedList {
    public static void main(String[] args) {
        int[] arr = {234, 2345, 1345, 34165, 43, 476557};
        Node head = createDLLFromArray(arr);
        System.out.println(head.getData());

        printDLL(head);
    }
}
