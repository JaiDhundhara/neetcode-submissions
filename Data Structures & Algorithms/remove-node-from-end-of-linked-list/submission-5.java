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
        ListNode slow=head;
        ListNode fast=head;
        int cnt=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            cnt++;
        }
        int length=0;
        if(fast==null){
            length=2*cnt;
        }
        else if(fast.next == null){
            length=(2*cnt)+1;
        }
        if(length==n){
            return head.next;
        }
        int pos=length-n;
        if(pos>cnt){
            pos=pos-cnt;
        }
        else{
            slow=head;
        }
        for(int i=1;i<pos;i++){
                slow=slow.next;
            }
        slow.next=slow.next.next;
        return head;
    }
}
