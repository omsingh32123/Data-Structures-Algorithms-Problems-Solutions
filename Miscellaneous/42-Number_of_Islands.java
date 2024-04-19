// Question Name : Number of Islands
// Question URL : https://leetcode.com/problems/number-of-islands/

class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    count++;
                    capture(grid,i,j,m,n);
                }
            }
        }
        return count;
    }
    public static void capture(char[][] grid, int i, int j, int m, int n)
    {
        grid[i][j]='0';
        if( j<n-1 && grid[i][j+1]=='1' )
        {
            capture(grid,i,j+1,m,n);
        }
        if( j>0 && grid[i][j-1]=='1' )
        {
            capture(grid,i,j-1,m,n);
        }
        if( i<m-1 && grid[i+1][j]=='1' )
        {
            capture(grid,i+1,j,m,n);
        }
        if( i>0 && grid[i-1][j]=='1' )
        {
            capture(grid,i-1,j,m,n);
        }
    }
}