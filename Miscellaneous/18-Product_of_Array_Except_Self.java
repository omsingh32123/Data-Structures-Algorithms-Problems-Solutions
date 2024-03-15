// Question Name : Product of Array Except Self
// Question URL : https://leetcode.com/problems/product-of-array-except-self/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pr=1,pr2=1,n=nums.length,c=0;
        for(int i=0;i<n;i++)
        {
            pr=pr*nums[i];
            if(nums[i]!=0)
            pr2=pr2*nums[i];
            else
            c++;
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
            if(c>1)
            ans[i]=0;
            else if( nums[i]!=0 )
            ans[i]=pr/nums[i];
            else
            ans[i]=pr2;
        }
        return ans;
    }
}