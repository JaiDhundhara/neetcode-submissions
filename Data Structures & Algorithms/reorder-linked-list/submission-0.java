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
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
       ListNode slow=head; 
       ListNode fast=head;
       while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
       }
       ListNode sh=slow.next;
       slow.next=null;
       ListNode mhead=reverse(sh);
       ListNode nhead=head;
       while(mhead!=null){
        ListNode mtemp=mhead.next;
        ListNode ntemp=nhead.next;
        nhead.next=mhead;
        nhead=ntemp;
        mhead.next=nhead;
        mhead=mtemp;
       }

    }
}
