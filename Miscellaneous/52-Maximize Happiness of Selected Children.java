// Question Name : Maximize Happiness of Selected Children
// Question URL : https://leetcode.com/problems/maximize-happiness-of-selected-children/

import java.util.Arrays;
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long res = 0;
        int n = happiness.length, j = 0;

        for (int i = n - 1; i >= n - k; --i) {
            happiness[i] = Math.max(happiness[i] - j++, 0);
            res += happiness[i];
        }

        return res;
    }
}