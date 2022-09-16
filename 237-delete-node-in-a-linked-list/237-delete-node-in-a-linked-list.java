/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode nodep = node ;
        int vall;
        while(nodep.next!=null){
            if(nodep.next.next==null){
                vall = nodep.next.val;
                nodep.val=vall;
                nodep.next=null;
                return;
            }
            vall = nodep.next.val;
            nodep.val=vall;
   
            nodep=nodep.next;
        }
        
    }
}