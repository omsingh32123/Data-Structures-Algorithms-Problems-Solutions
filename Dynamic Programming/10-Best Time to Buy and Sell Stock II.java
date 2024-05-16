// Question Name :  Best Time to Buy and Sell Stock II
// Question URL : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] pr) {
        int l = pr.length;
        int sum=0;
        for( int i=0 ; i<l-1 ; i++ )
        {
            if( pr[i] < pr[i+1] )
            {
                sum+=pr[i+1]-pr[i];
            }
        }
        return sum;
    }
}