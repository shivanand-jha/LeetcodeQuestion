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
    public ListNode middleNode(ListNode head) {
        ListNode mid = head;
        ListNode fast = head;
        int step = 0;
        while (fast != null) {
            if (step % 2 == 0) {
                if (fast.next != null) {
                    mid = mid.next;
                }
            }
            step++;
            fast = fast.next;
        }
        return mid; 
    }
}