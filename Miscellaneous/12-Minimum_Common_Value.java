// Question Name : Minimum Common Value
// Question URL : https://leetcode.com/problems/minimum-common-value/

import java.util.HashSet;
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet<>();
        int l1=nums1.length;
        int l2=nums2.length;
        int min=Integer.MAX_VALUE;
        for( int i=0 ; i<l1 ; i++ )
        {
            set.add(nums1[i]);
        }
        for( int i=0 ; i<l2 ; i++ )
        {
            if(set.contains(nums2[i]) && nums2[i]<min )
            {
                min=nums2[i];
            }
        }
        if(min==Integer.MAX_VALUE)
        return -1;
        return min;
    }
}