/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode list = new ListNode(0);

        ListNode temp = list;

        int tempSum = 0;

        while (head != null) {
            if (head.val == 0) {
                ListNode x = new ListNode(tempSum);
                temp.next = x;
                temp = temp.next;

                tempSum = 0;
            } else {
                tempSum += head.val;
            }

            head = head.next;
        }
        
        return list.next.next; 
    }
}
