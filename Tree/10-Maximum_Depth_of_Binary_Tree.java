// Question Name : Maximum Depth of Binary Tree
// Question URL : https://leetcode.com/problems/maximum-depth-of-binary-tree/

import java.util.*;

class Solution {
    public int maxDepth(TreeNode root) 
    {
        if(root==null)
        {
            return 0;
        }
        ArrayList<Integer> arr=new ArrayList<Integer>();
        depth(root,1,arr);
        int l=arr.size();
        int m=0;
        for(int i=0;i<l;i++)
        {
            int x=arr.get(i);
            if(x>m)
            {
                m=x;
            }
        }
        return m;
    }
    public void depth(TreeNode r, int i, ArrayList<Integer> arr)
    {
        if(r.left!=null)
        {
            depth(r.left,i+1,arr);
        }
        if(r.right!=null)
        {
            depth(r.right,i+1,arr);
        }
        if( r.left==null && r.right==null )
        {
            arr.add(i);
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