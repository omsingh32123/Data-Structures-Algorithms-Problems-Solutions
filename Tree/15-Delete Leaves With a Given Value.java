// Question Name :  Delete Leaves With a Given Value
// Question URL : https://leetcode.com/problems/delete-leaves-with-a-given-value/


class Solution {
    public TreeNode removeLeafNodes(TreeNode root, int t) {
        if( root.left!=null )
        root.left=removeLeafNodes(root.left,t);
        if( root.right!=null )
        root.right=removeLeafNodes(root.right,t);
        if( root.left==null && root.right==null && root.val==t )
        return null;
        return root;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
