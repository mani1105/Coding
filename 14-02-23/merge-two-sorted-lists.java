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
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        int dat;
        if(head1==null & head2 ==null){
            return null;
        }
        else if (head1==null &head2 != null){
            return head2;
        }
        else if(head1 != null & head2==null)
            return head1;
        else{
        if (head1.val<head2.val){
            dat=head1.val;
            head1=head1.next;    
        }
        else{
            dat=head2.val;
            head2=head2.next;
        }
        ListNode newNode=new ListNode(dat);
        ListNode curr=newNode;
        while(head1 != null & head2 != null ){
            if (head1.val<head2.val){                
                curr.next = head1;
                curr=curr.next;
                head1=head1.next;
                
            }
            else{
                curr.next=head2;
                curr=curr.next;
                
                head2=head2.next;
                
            }
            
        }
        while (head1==null & head2!=null){
            curr.next=head2;
            curr=curr.next;
            head2=head2.next;
        }
        while (head2==null & head1!=null){
            curr.next=head1;
            curr=curr.next;
            head1=head1.next;
        }

        return newNode;
        }
    }
}
