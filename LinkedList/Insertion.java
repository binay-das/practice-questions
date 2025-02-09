package LinkedList;

import static LinkedList.LinkedListUtils.length;
import static LinkedList.LinkedListUtils.print;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = LinkedListUtils.constructLL(arr);
        print(head);

        head = insertBeginning(head, 10);
        print(head);

        head = insertEnd(head, 10);
        print(head);

        head = insertKthPos(head, 387495, 3);
        print(head);
    }

    public static Node insertBeginning (Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        newNode.setNext(head);
        head = newNode;

        return head;
    }
    public static Node insertEnd (Node head, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        Node temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(newNode);

        return head;
    }

    public static Node insertKthPos (Node head, int x, int k) {
        Node temp1 = new Node(x);
        if (head == null) {
            return temp1;
        }
        if (k < 1 || k > length(head) + 1) {
            return head;
        }
        if (k == 1) {
            return insertBeginning(head, x);
        }
        if (k == length(head) + 1) {
            return insertEnd(head, x);
        }

        Node temp2 = head;
        int count = 1;
        while (count < k - 1) {
            temp2 = temp2.getNext();
            count++;
        }
        temp1.setNext(temp2.getNext());
        temp2.setNext(temp1);

        return head;
    }
}
