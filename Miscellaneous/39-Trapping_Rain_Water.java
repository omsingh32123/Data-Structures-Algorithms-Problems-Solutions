// Question Name : Trapping Rain Water
// Question URL : https://leetcode.com/problems/trapping-rain-water/
 
class Solution {
    public int trap(int[] ar) {
        int l=ar.length;
        int m=0,mi=0;
        int sum=0,bl=0;
        for(int i=0;i<l;i++)
        {
            if(m<ar[i]||m==ar[i])
            {
                sum+=((i-mi-1)*m)-bl;
                bl=0;
                m=ar[i];
                mi=i;
            }
            else
            {
                bl+=ar[i];
            }
        }
        m=0;
        bl=0;
        int z=mi;
        mi=l-1;
        for(int i=l-1;i>=z;i--)
        {
            if(m<ar[i]||m==ar[i])
            {
                sum+=((mi-i-1)*m)-bl;
                bl=0;
                m=ar[i];
                mi=i;
            }
            else
            {
                bl+=ar[i];
            }
        }
        return sum;
    }
}