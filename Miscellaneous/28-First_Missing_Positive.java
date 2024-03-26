// Question Name : First Missing Positive
// Question URL : https://leetcode.com/problems/first-missing-positive/

import java.util.HashSet;

class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for( int i=0 ; i<nums.length ; i++ )
        {
            set.add(nums[i]);
        }
        int i=1;
        while(i>0)
        {
            if(!set.contains(i))
            {
                return i;
            }
            i++;
        }
        return 0;
    }
}