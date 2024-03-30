// Question Name : Count Subarrays Where Max Element Appears at Least K Times
// Question URL : https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/

class Solution {
    public long countSubarrays(int[] ar, int k) {
        long n=ar.length,max=0;
        for(int i=0;i<n;i++)
        {
            if(max<ar[i])
            max=ar[i];
        }
        long l=0,r=0,count=0,ans=0;
        while( r<ar.length || l > r )
        {
            if(ar[(int)r]==max)
            count++;
            while( count>=k )
            {
                if(ar[(int)l]==max)
                    count--;
                l++;
                ans += ar.length-r;
            }
            r++;
        }
        return ans;
    }
}