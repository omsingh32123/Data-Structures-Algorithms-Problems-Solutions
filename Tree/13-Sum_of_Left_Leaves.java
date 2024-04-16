// Question Name : Sum of Left Leaves
// Question URL : https://leetcode.com/problems/sum-of-left-leaves/


class Solution {
    static int count=0;
    public int sumOfLeftLeaves(TreeNode root) {
        if( root==null || (root.left==null && root.right==null) )
        return 0;
        count=0;
        sumOfLeftLeaves2(root,0);
        return count;
    }
    public static void sumOfLeftLeaves2(TreeNode root, int last) {
        if( root==null )
        {
            return;
        }
        if( root.left==null && root.right==null )
        {
            if(last==0)
            count+=root.val;
            return;
        }
        sumOfLeftLeaves2(root.left,0);
        sumOfLeftLeaves2(root.right,1);
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