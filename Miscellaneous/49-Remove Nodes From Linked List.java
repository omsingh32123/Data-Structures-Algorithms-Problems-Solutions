// Question Name : Remove Nodes From Linked List
// Question URL : https://leetcode.com/problems/remove-nodes-from-linked-list/

import java.util.Stack;

class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode h=head;
        Stack<Integer> st=new Stack<>();
        while(h!=null)
        {
            st.push(h.val);
            h=h.next;
        }
        ListNode temp=new ListNode(st.pop());
        while(!st.isEmpty())
        {
            int num=st.pop();
            if( num >= temp.val )
            {
                ListNode t=new ListNode(num);
                t.next=temp;
                temp=t;
            }
        }
        return temp;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
