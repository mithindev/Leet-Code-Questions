package JUNE.DAY13;


public class Main extends ListNode{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next = new ListNode(2);

        ListNode ans = reverseKGroup(head, 2);

        ans.display();
    }

    static ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode test = temp;;

        for (int i = 0; i < k; i++) {
            test = test.next;
            if (test == null) {
                return head;
            }
        }

        reverse (temp, k);

        for (int i = 0; i<= k; i++) {
            temp = temp.next;
        }

        return reverseKGroup (temp, k);
    }

    static int elementAt (ListNode head, int index) {
        ListNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    static void reverse (ListNode node, int k) {
        for (int i = 0; i < k/2; i++) {
            int num1 = elementAt(node, i);
            int num2 = elementAt(node, k - i -1);
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
    }
}
