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
    public ListNode deleteMiddle(ListNode head) {
        ListNode mid = head ;
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
        ListNode a1 = mid;
        int h = countNode(head)/2;
        int a=0;
        while(h>1)
        {
        mid = mid.next;
            h--;
        }
            mid.next=mid.next.next;
        
        return a1;
    }
    public int countNode(ListNode head)
    {
        int l = 0;
        while(head !=null)
        {
            l++;
            head = head.next;
        }
        return l;
    }
}