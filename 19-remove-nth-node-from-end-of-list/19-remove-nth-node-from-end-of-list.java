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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode r = new ListNode(-1);
        r.next =head;
        ListNode a = r;
        ListNode b = r;
        for(int i=0; i<n; i++)
        {
            a=a.next;
        }
        while(a.next!=null)
        {
            a = a.next;
            b = b.next;
        }
        b.next=b.next.next;
        return r.next;
    }
}