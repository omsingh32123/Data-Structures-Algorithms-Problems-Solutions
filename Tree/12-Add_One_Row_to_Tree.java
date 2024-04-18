// Question Name : Add One Row to Tree
// Question URL : https://leetcode.com/problems/add-one-row-to-tree/

class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1)
        {
            TreeNode newRoot=new TreeNode(val);
            newRoot.left=root;
            return newRoot;
        }
        return addRow(root,val,depth,1,true);
    }
    public static TreeNode addRow(TreeNode root, int val, int d, int cd, boolean isLeft)
    {
        if(cd==d)
        {
            TreeNode nr=new TreeNode(val);
            if(isLeft)
            nr.left=root;
            else
            nr.right=root;
            return nr;
        }
        if(root==null)
        return null;
        root.left=addRow(root.left,val,d,cd+1,true);
        root.right=addRow(root.right,val,d,cd+1,false);
        return root;
    }
}