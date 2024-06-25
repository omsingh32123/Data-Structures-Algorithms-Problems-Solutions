// Question Name :  Binary Search Tree to Greater Sum Tree
// Question URL : https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/

class Solution {
    static int max=0;
    public TreeNode bstToGst(TreeNode root) {
        max=0;
        convert(root);
        return root;
    }
    public void convert(TreeNode root) {
        if( root == null )
        return;
        convert(root.right);
        max += root.val ;
        root.val = max ;
        convert(root.left);
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