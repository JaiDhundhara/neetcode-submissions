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
        if(head==null||head.next==null){
            return null;
        }
        ListNode temp =head;
        int cnt=0;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        if(cnt==n){
            head=head.next;
            return head;
        }
        int pos=cnt-n;
        temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        if(temp.next.next==null) {
            temp.next=null;
        }
        else{
            temp.next=temp.next.next;
        }
        return head;
    }
}
