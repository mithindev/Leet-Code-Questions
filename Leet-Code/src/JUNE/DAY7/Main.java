package JUNE.DAY7;

import java.util.List;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Main extends ListNode{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);

        ListNode ans = removeNodes(head);

        while (ans != null) {
            System.out.print(ans.val + "->");
            ans = ans.next;
        }

    }

    static ListNode removeNodes(ListNode head) {
        int max = head.val;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode temp = head;

        ListNode dhead = dummy;

        while (temp != null) {
            if (temp.val > max) {
                max = temp.val;
                dhead = temp;
                prev = temp;
                temp = temp.next;
            } else {
                prev.next = temp;
                temp = temp.next;
            }
        }
        return dummy.next;
    }
}
