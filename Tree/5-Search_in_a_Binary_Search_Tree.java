// Question Name : Search in a Binary Search Tree
// Question URL : https://leetcode.com/problems/search-in-a-binary-search-tree/description/

class Solution {
    static TreeNode node;
    public TreeNode searchBST(TreeNode root, int val) {
        node=null;
        search(root,val);
        return node;
    }
    public static void search(TreeNode root, int val)
    {
        if(root==null)
            return;
        if(root.val==val)
            node = root;
        search(root.left,val);
        search(root.right,val);
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