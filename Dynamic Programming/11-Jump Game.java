// Question Name :  Jump Game
// Question URL : https://leetcode.com/problems/jump-game/

class Solution {
    public boolean canJump(int[] nums) {
        int req=1;
        for( int i=nums.length-2 ; i>=0 ; i-- )
        {
            if( nums[i] < req )
            {
                if(i==0)
                return false;
                req++;
            }
            else
            req=1;
        }
        return true;
    }
}
