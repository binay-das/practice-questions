package LinkedList;

import static LinkedList.LinkedListUtils.*;

public class Deletion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node head = constructLL(arr);

        print(head);
        head = deleteBeginning(head);
        print(head);

        head = deleteEnd(head);
        print(head);

        head = deleteKth(head, 3);
        print(head);

        head = deleteValue(head, 3);
        print(head);
    }
    public static Node deleteBeginning(Node head) {
        // Node temp = head;   // java takes care of this using garbage collection
        if (head == null) {
            return head;
        }
        head = head.getNext();
        return head;
    }

    public static Node deleteEnd(Node head) {
        if (head == null || head.getNext() == null) {
            return null;
        }
        Node temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);

        return head;
    }

    public static Node deleteKth(Node head, int k) {
        if (head == null || k < 1 || k > length(head)) {
            return head;
        }
        if (k == 1) {
            return deleteBeginning(head);
        }
        if (k == length(head)) {
            return deleteEnd(head);
        }
        Node temp = head;
        int i = 1;
        while (i < k - 1) {
            temp = temp.getNext();
            i++;
        }
        temp.setNext(temp.getNext().getNext());

        return head;
    }

    public static Node deleteValue(Node head, int target) {
        if (head == null) {
            return head;
        }
        if (head.getData() == target) {
            return deleteBeginning(head);
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.getData() == target) {
                prev.setNext(temp.getNext());
                break;
            }
            prev = temp;
            temp = temp.getNext();
        }

        return head;
    }
}
