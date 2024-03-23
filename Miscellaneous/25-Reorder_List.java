// Question Name : Reorder List
// Question URL : https://leetcode.com/problems/reorder-list/

import java.util.Stack;
class Solution 
{
    public void reorderList(ListNode head) 
    {
        if(head==null || head.next==null)
        return;
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp=head;
        int i=1;
        while(temp!=null)
        {
            stack.push(temp);
            temp=temp.next;
            i++;
        }
        i-=3;
        temp=head;
        i=(i/2);
        for( int j=0 ; j<=i ; j++ )
        {
            ListNode t=temp.next;
            temp.next=stack.pop();
            temp=temp.next;
            temp.next=t;
            temp=temp.next;
        }
        temp.next=null;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
