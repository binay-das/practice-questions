package LinkedList.easy;

// https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list
class Node {
    int data;
    Node next;

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
}

public class G_ArraytoLinkedList {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(constructLL(arr).data);

    }

    // Given an array of integer arr.
    // Your task is to construct the linked list from arr & return the head of the linked list.
    static Node constructLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp1 = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp2 = new Node(arr[i]);
            temp1.next = temp2;
            temp1 = temp2;

        }

        return head;
    }
}