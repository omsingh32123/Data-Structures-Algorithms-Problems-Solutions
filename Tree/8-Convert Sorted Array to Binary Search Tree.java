// Question Name : Convert Sorted Array to Binary Search Tree
// Question URL : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return CreateBST(nums, 0, nums.length - 1);
    }

    private TreeNode CreateBST(int nums[], int l, int r) {
        if (l > r) { 
            return null;
        }
        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[mid]); 
        root.left = CreateBST(nums, l, mid - 1); 
        root.right = CreateBST(nums, mid + 1, r); 
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