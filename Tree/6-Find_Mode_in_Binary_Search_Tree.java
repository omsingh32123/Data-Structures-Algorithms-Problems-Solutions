// Question Name : Find Mode in Binary Search Tree
// Question URL : https://leetcode.com/problems/find-mode-in-binary-search-tree/description/

import java.util.*;
class Solution {
    public int[] findMode(TreeNode root) {
        if(root==null)
        {
            int ar[]=new int[1];
            ar[0]=0;
            return ar;
        }
        else
        {
            HashMap<Integer,Integer> ar=new HashMap<Integer,Integer>();
            find(root,ar);
            List<Integer> maxKey=new ArrayList<Integer>();
            int maxValue=0;
            for( Map.Entry< Integer , Integer > e : ar.entrySet() )
            {  
                if(e.getValue()>maxValue)
                {
                    maxValue=e.getValue();
                    maxKey.clear();
                    maxKey.add(e.getKey());
                }
                else if(e.getValue()==maxValue)
                {
                    maxKey.add(e.getKey());
                }
            }
            int n=maxKey.size();
            int array[]=new int[n];
            for(int i=0;i<n;i++)
            {
                array[i]=maxKey.get(i);
            }
            return array;
        }
    }
    public static void find(TreeNode root, HashMap<Integer,Integer> ar)
    {
        if(root==null)
            return;
        if(ar.containsKey(root.val))
            ar.put(root.val,ar.get(root.val)+1);
        else
            ar.put(root.val,1);
        find(root.left,ar);
        find(root.right,ar);
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
