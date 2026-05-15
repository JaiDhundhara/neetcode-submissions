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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy =new ListNode(0);
        int carry=0;
        ListNode tail=dummy;
        while(l1!=null ||l2!=null){
            int sum=0;
            if(l1==null){
                sum=l2.val+carry;
                l2=l2.next;
            }
            else if(l2==null){
                sum=l1.val+carry;
                l1=l1.next;
            }
            else{
                sum=l1.val+l2.val+carry;
                l1=l1.next;
                l2=l2.next;
            }
            if(sum>9){
                sum=sum%10;
                carry=1;
            }
            else carry=0;
            ListNode curr=new ListNode(sum);
            tail.next=curr;
            tail=tail.next;
        }
        if(carry==1){
            ListNode curr=new ListNode(1);
            tail.next=curr;
        }
        return dummy.next;
    }
}
