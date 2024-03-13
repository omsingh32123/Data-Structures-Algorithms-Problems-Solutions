// Question Name : Find the Pivot Integer
// Question URL : https://leetcode.com/problems/find-the-pivot-integer/

class Solution {
    public int pivotInteger(int nn) {
        double n=nn;
        for( double i=Math.floor(n/2) ; i<=n ; i+=1 )
        {
            if( (i/2)*(1+i) == ((n-i+1)/2)*(i+n) )
            {
                return (int)i;
            }
        }
        return -1;
    }
}