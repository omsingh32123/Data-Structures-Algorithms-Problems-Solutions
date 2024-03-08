// Question Name : Count Elements With Maximum Frequency
// Question URL : https://leetcode.com/problems/count-elements-with-maximum-frequency/



class Solution {
    public int maxFrequencyElements(int[] nums) {
        int l=nums.length,max=0,c=0;
        for(int i=0;i<l;i++)
        {
            int x=nums[i],f=1;
            for( int j=i+1;j<l;j++)
            {
                if(x==nums[j])
                f++;
            }
            if(max==f)
            {
                c++;
            }
            else if(f>max)
            {
                max=f;
                c=1;
            }
            
        }
        return c*max;
    }
}