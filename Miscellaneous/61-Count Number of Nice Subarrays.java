// Question Name :  Count Number of Nice Subarrays
// Question URL : https://leetcode.com/problems/count-number-of-nice-subarrays/


class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int res = 0, count = 0;
        for (int l = 0, r = 0; r < nums.length; r++){
            if (nums[r] % 2 == 1){
                k--;
                count = 0;
            }
            while (k == 0){
                count++;
                k += (nums[l++] % 2);
            }
            res += count;
        }
        return res;
    }
}