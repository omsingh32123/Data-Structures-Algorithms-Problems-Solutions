// Question Name :  Height Checker
// Question URL : https://leetcode.com/problems/height-checker/description/

import java.util.Arrays;

class Solution {
    public int heightChecker(int[] ht) {
        int[] ar = Arrays.copyOf(ht, ht.length);
        Arrays.sort(ar);
        int c=0;
        for( int i=0 ; i<ht.length ; i++ )
        {
            if(ar[i] != ht[i])
            c++;
        }
        return c;
    }
}