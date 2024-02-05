// Question Name : Minimum Absolute Difference in BST
// Question URL : https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/


class Solution {
    static int min;
    public int getMinimumDifference(TreeNode root) {
        if(root!=null)
        {
            min=100001;
            difference(root, root.val, root.val);
        }
        return min;
    }
    public static void difference(TreeNode root, int midr, int midl)
    {
        if(root.left!=null)
        {
            int newMin = (int)Math.abs(root.val - root.left.val);
            min = (newMin<min) ? newMin : min ;
            newMin = (int)Math.abs(root.left.val - midl);
            min = (newMin<min) ? newMin : min ;
            difference(root.left, root.val, midl);
        }
        if(root.right!=null)
        {
            int newMin = (int)Math.abs(root.val - root.right.val);
            min = (newMin<min) ? newMin : min ;
            newMin = (int)Math.abs(root.right.val - midr);
            min = (newMin<min) ? newMin : min ;
            difference(root.right, midr, root.val);
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
