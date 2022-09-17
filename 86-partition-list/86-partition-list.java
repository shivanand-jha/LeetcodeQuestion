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
    public ListNode partition(ListNode head, int x) {
        
        ListNode p = new ListNode(0);
        ListNode q = new ListNode(0);
        ListNode a = p;
        ListNode s = q;
        while(head!=null)
        {
            if(head.val<x)
            {
                a.next=head; 
                a = head;
            }
            else{
                s.next = head;
                s = head;
            }
            head = head.next;
        }
        s.next=null;
        a.next=q.next;
        return p.next;
    }
}