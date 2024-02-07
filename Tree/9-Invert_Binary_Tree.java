// Question Name : Invert Binary Tree
// Question URL : https://leetcode.com/problems/invert-binary-tree/

class Solution {
    public static TreeNode invertTree(TreeNode root) {
        if(root!=null)
        {
            TreeNode r=new TreeNode(root.val);
            invert(root,r);
            return r;
        }
        return root;
    }
    public static void invert(TreeNode r, TreeNode nr)
    {
        if(r.left!=null)
        {
            nr.right=new TreeNode(r.left.val);
            invert(r.left,nr.right);
        }
        if(r.right!=null)
        {
            nr.left=new TreeNode(r.right.val);
            invert(r.right,nr.left);
        }
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
