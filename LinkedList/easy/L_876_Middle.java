package LinkedList.easy;


public class L_876_Middle {
//    Given the head of a singly linked list, return the middle node of the linked list.
//    If there are two middle nodes, return the second middle node.
    public static ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    // Time Complexity: O(N/2) The algorithm requires the 'fast' pointer to reach the end of the list
    // which it does after approximately N/2 iterations (where N is the total number of nodes).
    // Therefore, the maximum number of iterations needed to find the middle node is proportional to the number of nodes in the list,
    // making the time complexity linear, or O(N/2) ~ O(N).

    public static void main(String[] args){

    }

}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
