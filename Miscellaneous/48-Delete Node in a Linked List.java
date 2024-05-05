// Question Name : Delete Node in a Linked List
// Question URL : https://leetcode.com/problems/delete-node-in-a-linked-list/


class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
