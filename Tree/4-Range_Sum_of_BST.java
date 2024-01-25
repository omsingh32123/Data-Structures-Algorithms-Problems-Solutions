// Question Name :  Range Sum of BST
// Question URL : https://leetcode.com/problems/range-sum-of-bst/description/

class Solution {
    static int sum=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        sumValues(root,low,high);
        return sum;
    }
    public static void sumValues(TreeNode root, int low, int high)
    {
        if(root==null)
        return;
        if( root.val>=low && root.val<=high )
        sum+=root.val;
        sumValues(root.left,low,high);
        sumValues(root.right,low,high);
    }
}