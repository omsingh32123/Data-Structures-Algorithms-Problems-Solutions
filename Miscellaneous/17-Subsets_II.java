// Question Name : Subsets II
// Question URL : https://leetcode.com/problems/subsets-ii/

import java.util.*;
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> output=new ArrayList<>();
        List<Integer> partarr=new ArrayList<>();
        Arrays.sort(nums);
        return solvesubset(partarr,nums,output,0);
    }
    public static List<List<Integer>> solvesubset(List<Integer> partarr,int nums[],List<List<Integer>> output,int i)
    {
        if(i>=nums.length)
        {
            if(!output.contains(partarr))
           { output.add(new ArrayList<>(partarr));}
            return output;
        }
        partarr.add(nums[i]);
        solvesubset(partarr,nums,output,i+1);
        partarr.remove(partarr.size()-1);
        solvesubset(partarr,nums,output,i+1);;
        return output;

    }
}