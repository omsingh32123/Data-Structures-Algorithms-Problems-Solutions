// Question Name : Palindrome Linked List
// Question URL : https://leetcode.com/problems/palindrome-linked-list/

import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
        return true;
        ListNode slow=head;
        ArrayList<Integer> ar=new ArrayList<>(); 
        while( slow!=null )
        {
            ar.add(slow.val);
            slow=slow.next;
        }
        for( int i=0 ; i<ar.size()/2 ; i++ )
        {
            if( ar.get(i) != ar.get(ar.size()-i-1) )
            return false;
        }
        return true;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
