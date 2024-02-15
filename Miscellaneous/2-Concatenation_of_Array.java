// Question Name : Concatenation of Array
// Question URL : https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int ans[]=new int[2*n];
        int ii=0;
        for(int i=0;i<n;i++)
        {
            ans[ii]=nums[i];
            ii++;
        }
        for(int i=0;i<n;i++)
        {
            ans[ii]=nums[i];
            ii++;
        }
        return ans;
    }
}