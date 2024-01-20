import java.util.*;
class Solution {
    List<TreeNode> list = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorderDFS(root);
        return createBST(list, 0, list.size() - 1);
    }

    public TreeNode createBST(List<TreeNode> list, int low, int high) {
        if (low > high) return null;
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(list.get(mid).val);
        node.left = createBST(list, low, mid - 1);
        node.right = createBST(list, mid + 1, high);
        return node;
    }

    public void inorderDFS(TreeNode root) {
        if (root == null) return;
        inorderDFS(root.left);
        list.add(root);
        inorderDFS(root.right);
    }
}
// Definition for a binary tree node.
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