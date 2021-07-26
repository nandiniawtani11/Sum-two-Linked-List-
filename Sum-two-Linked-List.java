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
    public ListNode head=null;
    public ListNode tail=null;
    public void insert(int n)
    {
        ListNode node=new ListNode(n);
        if(head==null)
        {
            head=node;
            tail=node;
        }
        else{
            tail.next=node;
            tail=node;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        int sum=0;
        int r=0;
        while(head1!=null && head2!=null)
        {
            sum=head1.val+head2.val+r;
            if(sum>9)
            {
                r=sum/10;
                insert(sum%10);
            }
            else
            {
                r=0;
                insert(sum);
            }
            head1=head1.next;
            head2=head2.next;
        }
        while(head1!=null)
        {
            sum=head1.val+r;
             if(sum>9)
            {
                r=sum/10;
                insert(sum%10);
            }
            else
            {
                r=0;
                insert(sum);
            }
            head1=head1.next;    
        }
         while(head2!=null)
        {
            sum=head2.val+r;
             if(sum>9)
            {
                r=sum/10;
                insert(sum%10);
            }
            else
            {
                r=0;
                insert(sum);
            }
            head2=head2.next;    
        }
        if(r!=0)
            insert(r);
        return head;   
    }
}
