// Question Name :  Contains Duplicate II
// Question URL : https://leetcode.com/problems/contains-duplicate-ii/

import java.util.HashSet;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int minInd = Math.min(nums.length,k);
        for( int i=0 ; i<minInd ; i++ )
        {
            set.add(nums[i]);
        }
        if( set.size() < minInd )
        {
            return true;
        }
        for( int i=minInd ; i<nums.length ; i++ )
        {
            set.add( nums[i] );
            if( set.size() < minInd+1 )
            {
                return true;
            }
            set.remove( nums[i-minInd] );
        }
        return false;
    }
}