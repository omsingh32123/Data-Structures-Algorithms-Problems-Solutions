// Question Name :  Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
// Question URL : https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/

import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> dec=new LinkedList<>();
        Deque<Integer> inc=new LinkedList<>();
        int l=0,r=0,max=0;
        while( r < nums.length )
        {
            int num = nums[r] ;
            while( !dec.isEmpty() && num > dec.peekLast() )
            {
                dec.pollLast();
            }
            dec.addLast(num);
            while( !inc.isEmpty() && num < inc.peekLast() )
            {
                inc.pollLast();
            }
            inc.addLast(num);
            while( dec.peekFirst() - inc.peekFirst() > limit )
            {
                if( dec.peekFirst() == nums[l] )
                    dec.pollFirst();
                if( inc.peekFirst() == nums[l] )
                    inc.pollFirst();
                l++;
            }
            int newMax = r-l+1;
            if( newMax>max )
            max = newMax ;
            r++;
        }
        return max;
    }
}