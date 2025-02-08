package LinkedList.easy;

public class G_Search {
    public static void main(String[] args) {

    }
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
