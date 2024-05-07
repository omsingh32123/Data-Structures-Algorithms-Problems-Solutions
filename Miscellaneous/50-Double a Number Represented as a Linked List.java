// Question Name : Double a Number Represented as a Linked List
// Question URL : https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/

import java.util.Stack;

class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode h=head;
        Stack<Integer> st=new Stack<>();
        while(h!=null)
        {
            st.push(h.val);
            h=h.next;
        }
        ListNode temp=null;
        int rem=0;
        while(!st.isEmpty())
        {
            int num=st.pop()*2+rem;
            if(num>9)
            {
                rem=1;
                num=num%10;
            }
            else
            {
                rem=0;
            }
            ListNode t=new ListNode(num);
            t.next=temp;
            temp=t;
        }
        if(rem==1)
        {
            ListNode t=new ListNode(1);
            t.next=temp;
            temp=t;
        }
        return temp;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
