// Question Name : Bag of Tokens
// Question URL : https://leetcode.com/problems/bag-of-tokens/

import java.util.Arrays;

class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        Arrays.sort(tokens);
        if( n==0 || power<tokens[0])
        return 0;
        if(n==1)
         if(tokens[0]>power)
         return 0;
         else
         return 1;
        if(n==2)
         if(power>tokens[1]+tokens[0])
         return 2;
         else
         return 1;
        int max=0;
        for(int i=0;i<n/2;i++)
        {
            int j=i,c=0,sum=0;
            while( sum<=power && j<=n-i )
            {
                sum+=tokens[j];
                j++;
                c++;
            }
            if(c-1>max)
            max=c-1;
            power+=tokens[n-i-1]-tokens[i];
        }
        return max;
    }
}