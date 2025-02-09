package LinkedList;

class Node {
    private int data;
    private Node next;
    Node () {
        data = 0;
        next = null;
    }
    Node(int data) {
        this.data = data;
        next = null;
    }
    Node (int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData () {
        return data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}

class LinkedListUtils {
    public static int length(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }


    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

    public static boolean search(Node head, int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.getData() == target) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public static Node reverse(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node curr = head, prev = null, next;

        while (curr != null) {
            next = curr.getNext();
            curr.setNext(prev);

            prev = curr;
            curr = next;
        }

        return prev;
    }
    static Node constructLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp1 = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp2 = new Node(arr[i]);
            temp1.setNext(temp2);
            temp1 = temp2;

        }

        return head;
    }
}
public class LinkedList {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        Node head = LinkedListUtils.constructLL(arr);

        System.out.println(LinkedListUtils.length(head));
        LinkedListUtils.print(head);
        System.out.println(LinkedListUtils.search(head, 3));

        head = LinkedListUtils.reverse(head);
        LinkedListUtils.print(head);
    }
}
