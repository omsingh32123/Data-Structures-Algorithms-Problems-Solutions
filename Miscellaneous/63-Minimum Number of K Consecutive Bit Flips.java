// Question Name :  Minimum Number of K Consecutive Bit Flips
// Question URL : https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/

import java.util.*;

class Solution {
    public int minKBitFlips(int[] nums, int k) {
        Queue<Integer> queue=new LinkedList<>();
        int count=0,flip=0;
        for( int i=0 ; i<nums.length ; i++ )
        {
            if( nums[i] == flip % 2 )
            {
                count++;
                flip++;
                queue.add(i+k-1);
            }
            if( !queue.isEmpty() && i == queue.peek() )
            {
                queue.remove();
                flip--;
            }
        }
        if( queue.isEmpty() )
        return count;
        return -1;
    }
}