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
    public ListNode reverse(ListNode left,ListNode right){
        ListNode curr=left;
        ListNode prev=null;
        while(curr!=right){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right) return head;
        ListNode dummy=new ListNode(0,head);
        int cnt=1;
        ListNode curr=head;
        ListNode lp=dummy;
        ListNode r=head;
        while(cnt<left){
            lp=lp.next;
            cnt++;
        }
        cnt=1;
        while(cnt<=right){
            r=r.next;
            cnt++;
        }
        ListNode l=lp.next;
        ListNode rh=reverse(l,r);
        l.next=r;
        lp.next=rh;
        return dummy.next;

    }
}