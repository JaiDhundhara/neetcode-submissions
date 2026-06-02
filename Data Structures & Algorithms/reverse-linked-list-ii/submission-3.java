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
        if(head==null || head.next==null){
            return head;
        }
        ListNode newhead =reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy =new ListNode(0,head);
        ListNode lprev=dummy;
        ListNode rightN=dummy;
        for(int i=0;i<left-1;i++){
            lprev=lprev.next;
        }
        for(int i=0; i<right;i++){
            rightN=rightN.next;
        }
        ListNode rnext=rightN.next;
        ListNode leftN=lprev.next;
        rightN.next=null;
        ListNode newhead=reverse(leftN);
        lprev.next=newhead;
        leftN.next=rnext;
        return dummy.next;
    }
}