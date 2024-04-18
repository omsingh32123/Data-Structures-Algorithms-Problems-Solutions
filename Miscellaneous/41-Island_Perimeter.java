// Question Name : Island Perimeter
// Question URL : https://leetcode.com/problems/island-perimeter/

class Solution {
    public int islandPerimeter(int[][] ar) {
        int m=ar.length;
        int n=ar[0].length;
        int sum=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(ar[i][j]==1)
                {
                    int c=0;
                    if( i==0 || ar[i-1][j]==0 )
                    c++;
                    if( j==0 || ar[i][j-1]==0 )
                    c++;
                    if( i==m-1 || ar[i+1][j]==0 )
                    c++;
                    if( j==n-1 || ar[i][j+1]==0 )
                    c++;
                    sum+=c;
                }
            }
        }
        return sum;
    }
}
