package LinkedList.easy;

public class L_206_Reverse_Recursive {
    public static void main(String[] args) {

    }

    // Recursive reversing of LL
    // Time Complexity -> O(N)
    // Space Complexity -> O(N)
    public static Node ReverseRecursive (Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = ReverseRecursive(head.next);
        Node next = head.next;
        next.next = head;
        head.next = null;

        return newHead;

    }

    // Iterative reversing of LL
    public static Node ReverseIterative (Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        return prev;
    }
}
