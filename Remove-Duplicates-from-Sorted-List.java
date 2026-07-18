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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
        return head;
        else
        {
            ListNode currentp=head;
            while(currentp.next!=null)
            {
                if(currentp.val==currentp.next.val)
                {
                    currentp.next=currentp.next.next;//
                }else
                {
                    currentp=currentp.next;//that is if the value is not same then jump the current pointer to the uniquw value
                }
            }
            return head;
        }
        
    }
}