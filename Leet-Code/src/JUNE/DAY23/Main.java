package JUNE.DAY23;

public class Main {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {

    }

    static boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode node = reverse(slow);

        while(node != null) {
            if (head.val != node.val) {
                return false;
            }
            head = head.next;
            node = node.next;
        }
        return true;
    }

    static ListNode reverse (ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode nxt;

        while (current != null) {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }
        return prev;
    }
}

