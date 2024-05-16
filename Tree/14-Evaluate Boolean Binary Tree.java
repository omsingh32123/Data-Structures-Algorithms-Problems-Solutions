// Question Name :  Evaluate Boolean Binary Tree
// Question URL : https://leetcode.com/problems/evaluate-boolean-binary-tree/

class Solution {
    public boolean evaluateTree(TreeNode root) 
    {
        if(root.val==0)
            return false;
        if(root.val==1)
            return true;
        boolean a=evaluateTree(root.left);
        boolean b=evaluateTree(root.right);
        if( root.val==2 && ( a || b ) )
            return true;
        if( root.val==3 && ( a && b ))
            return true;
        return false;
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