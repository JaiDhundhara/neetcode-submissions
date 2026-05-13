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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null&&list2==null){
            return list1;
        }
        else if(list1==null&&list2!=null){
            return list2;
        }
        else if(list2==null&&list1!=null){
            return list1;
        }
        ListNode head1=list1;
        ListNode head2=list2;
        ListNode temp=null;
        if(head1.val>head2.val){
            temp=head2;
            head2=head2.next;
        }
        else{
            temp=head1;
            head1=head1.next;
        }
        ListNode head=temp;
        while(head1!=null && head2!=null){
            if(head1.val>head2.val){
                temp.next=head2;
                head2=head2.next;
            }
            else{
                temp.next=head1;
                head1=head1.next;
            }
            temp=temp.next;
        }
        if(head1!=null){
            temp.next=head1;
        }
        else{
            temp.next=head2;
        }
        return head;
    }
}