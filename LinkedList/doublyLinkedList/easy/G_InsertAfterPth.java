package LinkedList.doublyLinkedList.easy;


//    Given a doubly-linked list, a position p, and an integer x.
//    The task is to add a new node with value x at the position just after pth node in the doubly linked list
//    and return the head of the updated list.
//    0 based  indexing

public class G_InsertAfterPth {
    public static Node addNode (Node head, int p, int x) {
        int length = length(head);
        if (p < 0 || p >= length) {
            return head;
        }
        Node newNode = new Node(x);
        if (head == null) {
            return newNode;
        }
        Node temp = head;

        if (p == length - 1) {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;

            return head;
        }

        int i = 1;
        while (i <= p) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        newNode.prev = temp;

        temp.next = newNode;
        if (newNode.next != null) {
            newNode.next.prev = newNode;
        }
        return head;
    }
    public static int length(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static Node insert(Node head, int data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        return head;
    }

    public static void main(String[] args) {
        Node dll = new Node(10);
        dll = insert(dll, 20);
        dll = insert(dll, 30);
        dll = insert(dll, 40);
        dll = insert(dll, 50);
        dll = insert(dll, 60);

        dll = addNode(dll, 0, 100);

        Node temp = dll;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("null");
    }

}
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}